package com.practice.designpattern.abstractfactory;

public interface GUIFactory {
    public abstract Button createButton();
    public abstract Checkbox createCheckbox();
}
