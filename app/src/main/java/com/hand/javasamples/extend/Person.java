package com.hand.javasamples.extend;

public class Person {

    private String name;
    private int age;

    public Person(String n,int i){
        this.name = n;
        this.age = i;
    }


    public void print(){
        System.out.print(name+"今年"+age+"岁");
    }

}
