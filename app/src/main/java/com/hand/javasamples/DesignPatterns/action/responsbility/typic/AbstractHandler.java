package com.hand.javasamples.DesignPatterns.action.responsbility.typic;

/**
 * 典型的实现方式，分为链表和数组实现
 */
public abstract class AbstractHandler {

    private AbstractHandler next;

    public void setNext(AbstractHandler next) {
        this.next = next;
    }

    public boolean handle(){
        //如果能够处理，则处理掉，不在往下传
        if(doHandle()){
           return true;
        }else {//如果不处理
            if(next != null) {
                next.handle();
            }
        }
        return false;
    }

    /**
     * 利用模板方法，可防止调用者在实现handle()方法时漏掉调用next.handle()，导致链无法执行下去。
     * @return
     */
    protected abstract boolean doHandle();

}
