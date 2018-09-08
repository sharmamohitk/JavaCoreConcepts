package com.practice.designpattern.abstractfactory;

public class Application {
    private Button button;
    private Checkbox checkbox;

    public Application(GUIFactory factory) {
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint() {
        button.buttonClicked();
        checkbox.checked();
    }
}
