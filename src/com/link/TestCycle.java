package com.link;

import com.Bicycle;

public class TestCycle {
    public static void main(String[] args){

        Object obj = new MountainBike(1,2,3,4);

        Bicycle cycle = new MountainBike(3,3,3,3);

        //if(obj instanceof MountainBike) {
            MountainBike moBike = (MountainBike) obj;
        //}
        MountainBike mocycle = (MountainBike) cycle;
        System.out.println(moBike.cadence);
        System.out.println(mocycle.seatHeight);

        cycle.testInstanceMethod();
        Bicycle.testClassMethod();

        mocycle.testInstanceMethod();
        MountainBike.testClassMethod();
    }
}
