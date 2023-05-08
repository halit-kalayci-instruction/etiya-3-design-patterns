package org.example.creational.abstractFactory.services;

import org.example.creational.abstractFactory.factories.UIComponentFactory;
import org.example.creational.abstractFactory.ui.elements.Button;
import org.example.creational.abstractFactory.ui.elements.Input;

public class ApplicationService {
    private UIComponentFactory uiComponentFactory;

    public ApplicationService
            (UIComponentFactory uiComponentFactory) {
        this.uiComponentFactory = uiComponentFactory;
    }

    public void render(){
        Button button = uiComponentFactory.renderButton();
        Input input = uiComponentFactory.renderInput();

        button.render();
        input.render();
    }
}
