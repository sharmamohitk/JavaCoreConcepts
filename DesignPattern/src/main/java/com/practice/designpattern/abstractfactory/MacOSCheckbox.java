package com.practice.designpattern.abstractfactory;

public class MacOSCheckbox implements Checkbox {

    @Override
    public void checked() {
        System.out.println("You have created MacOSCheckbox.");
    }
}
