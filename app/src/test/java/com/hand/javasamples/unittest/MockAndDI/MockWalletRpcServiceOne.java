package com.hand.javasamples.unittest.MockAndDI;


public class MockWalletRpcServiceOne extends WalletRpcService {

    public String moveMoney(String id, Long buyerId, Long sellerId, Double amount) {
        return "123abc";
    }
}
