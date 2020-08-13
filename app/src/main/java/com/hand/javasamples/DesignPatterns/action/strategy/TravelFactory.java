package com.hand.javasamples.DesignPatterns.action.strategy;

import java.util.HashMap;
import java.util.Map;

public class TravelFactory {
    static class TravelWay{
        private int minD;
        private int maxD;
        private TransportTravel mTransportTravel;
        public TravelWay(int min,int max,TransportTravel transportTravel){
            minD = min;
            maxD = max;
            mTransportTravel = transportTravel;
        }
    }

    private static Map<String,TravelWay> mWays = new HashMap();

    static {
        mWays.put("walk",new TravelWay(0,1,new WalkTravel()));
        mWays.put("car",new TravelWay(1,100,new CarTravel()));
        mWays.put("highrailway",new TravelWay(100,1000,new HighRailwayTravel()));
        mWays.put("airplane",new TravelWay(1000,10000,new AirPlaneTravel()));
        mWays.put("rocket",new TravelWay(10000,Integer.MAX_VALUE,new RocketTravel()));
        //如果要新增，就只需要在这里增加策略对象缓存，而这些又可以通过配置文件或者注解动态添加，做到不修改任何代码，只修改配置文件就能配置策略。
    }

    public static TransportTravel getTravelWay(int distance){
        for(Map.Entry<String,TravelWay> entry : mWays.entrySet()){
            TravelWay travelWay = entry.getValue();
            if(inRange(distance,travelWay)){
                return travelWay.mTransportTravel;
            }
        }
        return null;
    }

    private static boolean inRange(int distance,TravelWay travelWay){
        int min = travelWay.minD;
        int max = travelWay.maxD;
        if(min < distance && distance <= max){
            return true;
        }
        return false;
    }

}
