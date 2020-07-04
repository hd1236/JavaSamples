package com.hand.javasamples.unittest.MockAndDI;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class TestMockAndDI {

    @Test
    public void test1() {
        Long buyerId = 123L;
        Long sellerId = 234L;
        Long productId = 345L;
        String orderId = "456";
        Transaction transaction = new Transaction(null, buyerId, sellerId, productId, orderId);
        // 使用mock对象来替代真正的RPC服务
        transaction.setWalletRpcService(new MockWalletRpcServiceOne());
        TransactionLock mockLock = new TransactionLock(){
            @Override
            public boolean lock(String id) {
                return true;
            }

            @Override
            public void unlock(String id) {
            }
        };
        transaction.setLock(mockLock);
        boolean executedResult = false;
        try {
            executedResult = transaction.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
        assertTrue(executedResult);
        assertEquals(STATUS.EXECUTED, transaction.getStatus());
    }

    @Test
    public void test5() {
        Long buyerId = 123L;
        Long sellerId = 234L;
        Long productId = 345L;
        String orderId = "456";
        Transaction transaction = new Transaction(null, buyerId, sellerId, productId, orderId);
        // 使用mock对象来替代真正的RPC服务
        transaction.setWalletRpcService(new MockWalletRpcServiceTwo());
        TransactionLock mockLock = new TransactionLock(){
            @Override
            public boolean lock(String id) {
                return true;
            }

            @Override
            public void unlock(String id) {
            }
        };
        transaction.setLock(mockLock);
        boolean executedResult = false;
        try {
            executedResult = transaction.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
        assertFalse(executedResult);
        assertEquals(STATUS.FAILED, transaction.getStatus());
    }

    /**
     * 异常测试
     * @throws Exception
     */
    @Test(expected = Exception.class)
    public void test2() throws Exception {
        Long buyerId = null;
        Long sellerId = null;
        Long productId = 345L;
        String orderId = "456";
        Transaction transaction = new Transaction(null, buyerId, sellerId, productId, orderId);
        // 使用mock对象来替代真正的RPC服务
        transaction.setWalletRpcService(new MockWalletRpcServiceTwo());
        TransactionLock mockLock = new TransactionLock(){
            @Override
            public boolean lock(String id) {
                return true;
            }

            @Override
            public void unlock(String id) {
            }
        };
        transaction.setLock(mockLock);
        boolean executedResult = false;
        executedResult = transaction.execute();
    }



    @Test
    public void test3() {
        Long buyerId = 123L;
        Long sellerId = 234L;
        Long productId = 345L;
        String orderId = "456";
        Transaction transaction = new Transaction(null, buyerId, sellerId, productId, orderId){
            @Override
            protected boolean isExpired() {
                return true;
            }
        };
        transaction.setWalletRpcService(new MockWalletRpcServiceOne());
        boolean actualResult = false;
        try {
            actualResult = transaction.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
        assertFalse(actualResult);
        assertEquals(STATUS.EXPIRED, transaction.getStatus());
    }

    @Test
    public void test4() {
        Long buyerId = 123L;
        Long sellerId = 234L;
        Long productId = 345L;
        String orderId = "456";
        Transaction transaction = new Transaction(null, buyerId, sellerId, productId, orderId);
        transaction.setWalletRpcService(new MockWalletRpcServiceOne());
        boolean actualResult = false;
        try {
            actualResult = transaction.execute();
            assertEquals(STATUS.EXECUTED, transaction.getStatus());
            actualResult = transaction.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
        assertTrue(actualResult);
        assertEquals(STATUS.EXECUTED, transaction.getStatus());
    }


    @Test
    public void test6() {
        Long buyerId = 123L;
        Long sellerId = 234L;
        Long productId = 345L;
        String orderId = "456";
        final Transaction transaction = new Transaction(null, buyerId, sellerId, productId, orderId);
        transaction.setWalletRpcService(new MockWalletRpcServiceThree());
        new Thread(new Runnable() {
            @Override
            public void run() {
                boolean actualResult = false;
                try {
                    actualResult = transaction.execute();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                assertTrue(actualResult);
                assertEquals(STATUS.EXECUTED, transaction.getStatus());
            }
        }).start();

        new Thread(new Runnable() {
            @Override
            public void run() {
                boolean actualResult = false;
                try {
                    actualResult = transaction.execute();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                assertFalse(actualResult);
                assertEquals(STATUS.EXECUTING, transaction.getStatus());
            }
        }).start();

    }



}
