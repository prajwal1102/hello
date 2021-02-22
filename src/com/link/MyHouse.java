package com.link;

import java.lang.annotation.Inherited;


public class MyHouse implements House {

    @Deprecated
    public void open() {

        System.out.println("Hello");
    }
    public void openFrontDoor() {
        System.out.println("Hello FrontDoor");

    }
    public void openBackDoor() {}


    public static void main(String[] args){

        MyHouse h1 = new MyHouse();
        h1.open();

    }
}