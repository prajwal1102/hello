package com.link;


public interface House {
/* This method is deprecated and replaced with openFrontdoor and openBackdoor methods*/
    @Deprecated
    void open();
    void openFrontDoor();
    void openBackDoor();
}