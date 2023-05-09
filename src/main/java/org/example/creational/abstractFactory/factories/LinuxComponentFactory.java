package org.example.creational.abstractFactory.factories;

import org.example.creational.abstractFactory.ui.elements.*;

public class LinuxComponentFactory implements UIComponentFactory{
    @Override
    public Button renderButton() {
        return new LinuxButton();
    }

    @Override
    public Input renderInput() {
        return new LinuxInput();
    }
}
