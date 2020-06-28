package com.hand.javasamples.javabase.ThreadAlternatePrint;

import java.util.LinkedList;

/**
 * 三个及以上线程轮流打印
 */
public class AlternateMultiThread extends Thread {

    private int mType;
    private int mTotalType;
    private Object mLock;
    public static int sIndex;
    public static int sCurrentType;


    public AlternateMultiThread(String name, int type, int totalType, Object lock) {
        this.setName(name);
        mType = type;
        mLock = lock;
        mTotalType = totalType;
    }

    @Override
    public void run() {

        while (sIndex <= 100) {

            synchronized (mLock) {

                //判断type
                if (sCurrentType == mType) {

                    //打印index，并+1
                    System.out.println(getName() + ":" + sIndex);
                    sIndex++;

                    //处理下一个打印线程type
                    sCurrentType = (mType + 1) % mTotalType;
                    //唤醒其他线程
                    mLock.notifyAll();
                }

                try {
                    if (sIndex <= 100) {
                        mLock.wait();
                    }
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

    }

    private LinkedList<Integer> adj[];

    public void Graph(int v){
        adj = new LinkedList[v];
        adj[0] = new LinkedList<>();
    }
}
