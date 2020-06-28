package com.hand.javasamples.javabase.ThreadAlternatePrint;

/**
 * 两个线程轮流打印
 */
public class AlternateTwoThread extends Thread {

    private Object mLock;

    public static int index;

    public AlternateTwoThread(Object o, String name){
        mLock = o;
        this.setName(name);
    }

    @Override
    public void run() {
//        addAndPrint();
        addAndPrint2();
    }

    /**
     * 两个线程轮流打印
     */
    public void addAndPrint(){
        synchronized (mLock){
            while(index <= 100){
                System.out.println(Thread.currentThread().getName()+":"+index);
                index++;
                mLock.notifyAll();

                try {
                    mLock.wait();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
            mLock.notifyAll();
            System.out.println(Thread.currentThread().getName()+":end");
        }
    }


    /**
     * 两个线程轮流打印
     * 这种方式更为合理，同步
     */
    public void addAndPrint2(){
        while(index <= 100){
            synchronized (mLock){
                System.out.println(Thread.currentThread().getName()+":"+index);
                index++;
                mLock.notifyAll();

                try {
                    if(index <= 100){
                        mLock.wait();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
