package org.example.creational.abstractFactory;


import org.example.creational.abstractFactory.factories.LinuxComponentFactory;
import org.example.creational.abstractFactory.factories.UIComponentFactory;
import org.example.creational.abstractFactory.factories.WindowsComponentFactory;
import org.example.creational.abstractFactory.services.ApplicationService;

public class Main {
    public static void main(String[] args) {
        // Windows,Linux
        String os = System.getProperty("os.name").toLowerCase();
        UIComponentFactory factory;
        if(os.contains("windows")){
            factory = new WindowsComponentFactory();
        }else{
            factory = new LinuxComponentFactory();
        }
        ApplicationService applicationService = new ApplicationService(factory);
        applicationService.render();
    }
}
