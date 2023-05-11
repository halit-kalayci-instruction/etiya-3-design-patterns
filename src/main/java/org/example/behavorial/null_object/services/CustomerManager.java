package org.example.behavorial.null_object.services;

import org.example.behavorial.null_object.loggers.ILogger;

public class CustomerManager implements CustomerService {

    private ILogger logger;

    public CustomerManager(ILogger logger) {
        this.logger = logger;
    }

    @Override
    public void add() {
        // Null reference check
        //if(logger != null)
        logger.log();
        System.out.println("Customer added.");
    }
}
