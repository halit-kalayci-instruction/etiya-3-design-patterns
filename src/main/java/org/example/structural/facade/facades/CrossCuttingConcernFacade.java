package org.example.structural.facade.facades;

import org.example.structural.facade.authorization.IAuthorization;
import org.example.structural.facade.caching.ICaching;
import org.example.structural.facade.logging.ILogging;

public class CrossCuttingConcernFacade {
    public ILogging logging;
    public ICaching caching;
    public IAuthorization authorization;

    public CrossCuttingConcernFacade(ILogging logging, ICaching caching, IAuthorization authorization) {
        this.logging = logging;
        this.caching = caching;
        this.authorization = authorization;
    }
}
