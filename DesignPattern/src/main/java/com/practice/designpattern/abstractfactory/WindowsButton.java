package com.practice.designpattern.abstractfactory;

public class WindowsButton implements Button {

    @Override
    public void buttonClicked() {
        System.out.println("You have created WindowsButton.");
    }
}