package com.hand.javasamples.unittest.MockAndDI;

class RedisDistributedLock {

    private static RedisDistributedLock mInstance = new RedisDistributedLock();

    public static RedisDistributedLock getSingletonIntance() {
        return mInstance;
    }

    public boolean lockTransction(String id){
        return true;
    }

    public boolean unlockTransction(String id){
        return true;
    }
}
