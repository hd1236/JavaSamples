package com.hand.javasamples.DesignPatterns.action.visitor;

import com.hand.javasamples.DesignPatterns.action.visitor.achieve_1.Adult1;
import com.hand.javasamples.DesignPatterns.action.visitor.achieve_1.Child1;
import com.hand.javasamples.DesignPatterns.action.visitor.achieve_1.People1;
import com.hand.javasamples.DesignPatterns.action.visitor.achieve_2_opt.Adult2;
import com.hand.javasamples.DesignPatterns.action.visitor.achieve_2_opt.Child2;
import com.hand.javasamples.DesignPatterns.action.visitor.achieve_2_opt.People2;
import com.hand.javasamples.DesignPatterns.action.visitor.achieve_3_opt.Adult3;
import com.hand.javasamples.DesignPatterns.action.visitor.achieve_3_opt.Child3;
import com.hand.javasamples.DesignPatterns.action.visitor.achieve_3_opt.EatAction3;
import com.hand.javasamples.DesignPatterns.action.visitor.achieve_3_opt.People3;
import com.hand.javasamples.DesignPatterns.action.visitor.visitor.ActionVisitor;
import com.hand.javasamples.DesignPatterns.action.visitor.visitor.Adult;
import com.hand.javasamples.DesignPatterns.action.visitor.visitor.Child;
import com.hand.javasamples.DesignPatterns.action.visitor.visitor.EatAction;
import com.hand.javasamples.DesignPatterns.action.visitor.visitor.People;
import com.hand.javasamples.DesignPatterns.action.visitor.visitor.SleepAction;

import java.util.ArrayList;
import java.util.List;

public class Tester {



    public static void main(String[] args){
//        //这种方式违背开闭原则，且所有行为都在实现类中，越积累越臃肿
//        List<People1> peopleList = getPeople1();
//        for(People1 people : peopleList){
//            people.eat();
//        }

//        EatAction eat = new EatAction();
//        List<People2> peopleList = getPeople2();
//        for(People2 people2 : peopleList){
//            eat.eat(people2);//产生编译错误
//        }

//        EatAction3 eat = new EatAction3();
//        List<People3> peopleList = getPeople3();
//        for(People3 people3 : peopleList){
//            people3.doAction(eat);
//        }


        ActionVisitor eat = new EatAction();
        List<People> peopleList = getPeople();
        for(People people : peopleList){
            people.doAction(eat);
        }

        ActionVisitor sleep = new SleepAction();
        for(People people : peopleList){
            people.doAction(sleep);
        }

    }

    /**
     * 创建了一堆人类
     * @return
     */
    private static List<People1> getPeople1() {
        List<People1> peopleList = new ArrayList<>();
        peopleList.add(new Adult1("hand"));
        peopleList.add(new Child1("hl"));
        peopleList.add(new Adult1("lxs"));
        peopleList.add(new Child1("zj"));

        return peopleList;
    }

    /**
     * 创建了一堆人类
     * @return
     */
    private static List<People2> getPeople2() {
        List<People2> peopleList = new ArrayList<>();
        peopleList.add(new Adult2("hand"));
        peopleList.add(new Child2("hl"));
        peopleList.add(new Adult2("lxs"));
        peopleList.add(new Child2("zj"));

        return peopleList;
    }

    /**
     * 创建了一堆人类
     * @return
     */
    private static List<People3> getPeople3() {
        List<People3> peopleList = new ArrayList<>();
        peopleList.add(new Adult3("hand"));
        peopleList.add(new Child3("hl"));
        peopleList.add(new Adult3("lxs"));
        peopleList.add(new Child3("zj"));

        return peopleList;
    }

    /**
     * 创建了一堆人类
     * @return
     */
    private static List<People> getPeople() {
        List<People> peopleList = new ArrayList<>();
        peopleList.add(new Adult("hand"));
        peopleList.add(new Child("hl"));
        peopleList.add(new Adult("lxs"));
        peopleList.add(new Child("zj"));

        return peopleList;
    }
}
