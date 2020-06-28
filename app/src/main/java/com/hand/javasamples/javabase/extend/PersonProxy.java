package com.hand.javasamples.javabase.extend;

public class PersonProxy {

    private Person mPerson;
    public PersonProxy(Person person){
        this.mPerson = person;
    }


    public static PersonProxy CreatePerson(String n, int i){
        PersonProxy proxy = new PersonProxy(new Person(n,i));
        StringBuilder builder = new StringBuilder();
        builder.append('c');
        return proxy;
    }

    public void print(){
        mPerson.print();
    }

}
