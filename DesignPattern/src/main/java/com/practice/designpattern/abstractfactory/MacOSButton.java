package com.practice.designpattern.abstractfactory;

public class MacOSButton implements Button {

    @Override
    public void buttonClicked() {
        System.out.println("You have created MacOSButton.");
    }
}
