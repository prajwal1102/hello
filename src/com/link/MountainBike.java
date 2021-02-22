package com.link;

import com.Bicycle;

public class MountainBike extends Bicycle {

    // the MountainBike subclass adds one field
    public int seatHeight;

    // the MountainBike subclass has one constructor
    public MountainBike(int startHeight,
                        int startCadence,
                        int startSpeed,
                        int startGear) {
        //super(startCadence, startSpeed, startGear);
        super(startCadence);
        super.gear =startGear;
        seatHeight = startHeight;
    }

    // the MountainBike subclass adds one method
    public void setHeight(int newValue) {
        seatHeight = newValue;
    }


    public static void testClassMethod() {
        System.out.println("The static method in MountainBike");
    }

    @Override
    public void testInstanceMethod() {
        System.out.println("The instance method in MountainBike");
    }
}
