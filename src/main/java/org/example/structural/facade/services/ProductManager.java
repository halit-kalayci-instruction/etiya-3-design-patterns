package org.example.structural.facade.services;

import org.example.structural.facade.authorization.IAuthorization;
import org.example.structural.facade.caching.ICaching;
import org.example.structural.facade.facades.CrossCuttingConcernFacade;
import org.example.structural.facade.logging.ILogging;

public class ProductManager implements ProductService {
    private CrossCuttingConcernFacade crossCuttingConcernFacade;
    public ProductManager(CrossCuttingConcernFacade crossCuttingConcernFacade) {
        this.crossCuttingConcernFacade = crossCuttingConcernFacade;
    }

    @Override
    public void save() {
        crossCuttingConcernFacade.authorization.authorize();
        crossCuttingConcernFacade.logging.log();
        crossCuttingConcernFacade.caching.cache();
        System.out.println("Product Saved");
    }
}
