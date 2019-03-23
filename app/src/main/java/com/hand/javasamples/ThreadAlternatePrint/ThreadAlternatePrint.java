package com.hand.javasamples.ThreadAlternatePrint;

public class ThreadAlternatePrint {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("hello world");

        Object object = new Object();
//        AlternateTwoThread ThreadA = new AlternateTwoThread(object,"ThreadA");
//        AlternateTwoThread ThreadB = new AlternateTwoThread(object,"ThreadB");
//        ThreadA.start();
//        ThreadB.start();

        AlternateMultiThread threadA = new AlternateMultiThread("ThreadA",0,4,object);
        AlternateMultiThread threadB = new AlternateMultiThread("ThreadB",1,4,object);
        AlternateMultiThread threadC = new AlternateMultiThread("ThreadC",2,4,object);
        AlternateMultiThread threadD = new AlternateMultiThread("ThreadD",3,4,object);
        threadA.start();
        Thread.sleep(1);
        threadB.start();
        Thread.sleep(1);
        threadC.start();
        Thread.sleep(1);
        threadD.start();
    }

}
