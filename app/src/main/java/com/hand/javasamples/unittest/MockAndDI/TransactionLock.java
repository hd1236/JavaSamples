package com.hand.javasamples.unittest.MockAndDI;

public class TransactionLock {

    public boolean lock(String id){
        return RedisDistributedLock.getSingletonIntance().lockTransction(id);
    }

    public void unlock(String id){
        RedisDistributedLock.getSingletonIntance().unlockTransction(id);
    }
}
