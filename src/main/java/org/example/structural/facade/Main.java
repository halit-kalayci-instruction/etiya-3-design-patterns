package org.example.structural.facade;

import org.example.structural.facade.authorization.Authorization;
import org.example.structural.facade.caching.Caching;
import org.example.structural.facade.facades.CrossCuttingConcernFacade;
import org.example.structural.facade.logging.Logging;
import org.example.structural.facade.services.ProductManager;
import org.example.structural.facade.services.ProductService;

public class Main {
    public static void main(String[] args) {
        CrossCuttingConcernFacade crossCuttingConcernFacade = new CrossCuttingConcernFacade(new Logging(), new Caching(), new Authorization());

        ProductService productService = new ProductManager(crossCuttingConcernFacade);
        productService.save();

        ProductService productService1 = new ProductManager(crossCuttingConcernFacade);
        productService1.save();
    }
}
