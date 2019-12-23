package com.hand.javasamples.extend;

public class BaseStudent {

//    protected Person mPerson;
    protected PersonProxy mPerson;

    public BaseStudent(String n, int i){
        mPerson = PersonProxy.CreatePerson(n,i);
    }

    public void pringStudentName()throws Exception{
        mPerson.print();
    }
}
