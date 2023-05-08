package org.example.creational.abstractFactory.factories;

import org.example.creational.abstractFactory.ui.elements.Button;
import org.example.creational.abstractFactory.ui.elements.Input;

public interface UIComponentFactory {
    Button renderButton();
    Input renderInput();
}
