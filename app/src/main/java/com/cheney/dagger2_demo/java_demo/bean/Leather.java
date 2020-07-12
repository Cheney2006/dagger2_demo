package com.cheney.dagger2_demo.java_demo.bean;

/**
 * 皮革
 */
public class Leather {
    public Leather(){
        System.out.println("new Leather()");
    }

    public Leather(String color){
        System.out.println("new Leather() color:"+color);
    }
}
