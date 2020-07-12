package com.cheney.dagger2_demo.java_demo.bean;

/**
 * 车座
 */
public class Seat {

    private Leather leather;

    public Seat() {
        System.out.println( "new Seat()");
    }

    public Seat(String str) {
        System.out.println( str);
    }

    public Seat(Leather leather) {
        this.leather = leather;
        System.out.println("new Seat(Leather)");
    }
}
