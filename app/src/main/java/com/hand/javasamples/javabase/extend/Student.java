package com.hand.javasamples.javabase.extend;

class Student  extends BaseStudent implements Man {

    public Student(String n, int i) {
        super(n, i);
    }

    public void printInfo(){
        this.mPerson.print();
    }



    public static void main(String[] args){
        Student s = new Student("Hand",30);
        s.setName();
    }

    @Override
    public void setName() {

    }
}
