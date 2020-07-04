package com.hand.javasamples.unittest.MockAndDI;

public class MockWalletRpcServiceThree extends WalletRpcService {

    public String moveMoney(String id, Long buyerId, Long sellerId, Double amount) {
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "1111";
    }

}
