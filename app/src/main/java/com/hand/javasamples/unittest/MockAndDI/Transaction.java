package com.hand.javasamples.unittest.MockAndDI;


/**
 * 抽象简化之后的一个电商系统的交易类，用来记录每笔订单交易的情况
 * 6个测试用例
 * 1、正常情况下，交易执行成功，回填用于对账（交易与钱包的交易流水）用的 walletTransactionId，交易状态设置为 EXECUTED，函数返回 true。
 * 2、buyerId、sellerId 为 null、amount 小于 0，返回 InvalidTransactionException。
 * 3、交易已过期（createTimestamp 超过 14 天），交易状态设置为 EXPIRED，返回 false。
 * 4、交易已经执行了（status==EXECUTED），不再重复执行转钱逻辑，返回 true。
 * 5、钱包（WalletRpcService）转钱失败，交易状态设置为 FAILED，函数返回 false。
 * 6、交易正在执行着，不会被重复执行，函数直接返回 false。
 */
public class Transaction {
    private String id;
    private Long buyerId;
    private Long sellerId;
    private Long productId;
    private String orderId;
    private Long createTimestamp;
    private Double amount = 1.0d;
    private STATUS status;
    private String walletTransactionId;

    private WalletRpcService mWalletRpcService;

    private TransactionLock mLock;

    // ...get() methods...

    public Transaction(String preAssignedId, Long buyerId, Long sellerId, Long productId, String orderId) {
        if (preAssignedId != null && !preAssignedId.isEmpty()) {
            this.id = preAssignedId;
        } else {
            this.id = IdGenerator.generateTransactionId();
        }
        if (!this.id.startsWith("t_")) {
            this.id = "t_" + preAssignedId;
        }
        this.buyerId = buyerId;
        this.sellerId = sellerId;
        this.productId = productId;
        this.orderId = orderId;
        this.status = STATUS.TO_BE_EXECUTD;
        this.createTimestamp = System.currentTimeMillis();
        mLock = new TransactionLock();
    }

    public boolean execute() throws Exception {
        if (buyerId == null || (sellerId == null || amount < 0.0)){
            throw new Exception("");
        }
        if (status == STATUS.EXECUTED) return true;
        boolean isLocked = false;
        try {
            if(status == STATUS.EXECUTING){
                return false;
            }
            isLocked = mLock.lock(id);
            if (!isLocked) {
                return false; // 锁定未成功，返回false，job兜底执行
            }
            if (status == STATUS.EXECUTED) return true; // double check
            if (isExpired()) {
                this.status = STATUS.EXPIRED;
                return false;
            }
            this.status = STATUS.EXECUTING;
            String walletTransactionId = mWalletRpcService.moveMoney(id, buyerId, sellerId, amount);
            if (walletTransactionId != null) {
                this.walletTransactionId = walletTransactionId;
                this.status = STATUS.EXECUTED;
                return true;
            } else {
                this.status = STATUS.FAILED;
                return false;
            }
        } finally {
            if (isLocked) {
                mLock.unlock(id);
            }
        }
    }

    protected boolean isExpired(){
        long executionInvokedTimestamp = System.currentTimeMillis();
        return executionInvokedTimestamp - createTimestamp > 14 * 24 * 60 * 60 * 1000;
    }

    /**
     * 通过依赖注入mock的原对象替换原对象
     * @param service
     */
    public void setWalletRpcService(WalletRpcService service){
        mWalletRpcService = service;
    }

    /**
     * 通过依赖注入mock的对象替换静态方法
     * @param lock
     */
    public void setLock(TransactionLock lock){
        mLock = lock;
    }

    public STATUS getStatus(){
        return status;
    }

}