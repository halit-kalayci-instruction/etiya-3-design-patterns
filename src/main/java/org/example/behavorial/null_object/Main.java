package org.example.behavorial.null_object;

import org.example.behavorial.null_object.loggers.DatabaseLogger;
import org.example.behavorial.null_object.loggers.StubLogger;
import org.example.behavorial.null_object.services.CustomerManager;
import org.example.behavorial.null_object.services.CustomerService;
//15.20
public class Main {
    public static void main(String[] args) {
        CustomerService customerService =
                new CustomerManager(new DatabaseLogger());
        customerService.add();

        CustomerService customerService1 = new CustomerManager(new StubLogger());
        customerService1.add();
    }
}
