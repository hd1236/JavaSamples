package com.hand.javasamples.DesignPatterns.structure.Flyweight;

/**
 * 享元模式：类似jdbc连接池或者线程池,但不是。
 * 享元对象是不可变对象，把相似的、不经常变动的部分抽出来封装成享元对象，通过工厂模式获取。着重为了节省空间。
 * @author admin
 *
 */
public class Flyweight {

    public static void main(String[] args){
        Integer i = 30;
        Integer j = 30;
        Integer x = 129;
        Integer y = 129;
        System.out.println(i==j);
        System.out.println(x==y);

        String s1 = "呵呵";//在内存中分配常量池中已达到复用目的
        String s2 = "呵呵";//指向常量池中的享元对象
        String s3 = new String("呵呵");//重新分配了堆内存空间

        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
    }
}
