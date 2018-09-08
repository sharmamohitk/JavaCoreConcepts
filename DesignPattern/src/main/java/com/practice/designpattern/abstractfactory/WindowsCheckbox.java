package com.practice.designpattern.abstractfactory;

public class WindowsCheckbox implements Checkbox {

    @Override
    public void checked() {
        System.out.println("You have created WindowsCheckbox.");
    }
}