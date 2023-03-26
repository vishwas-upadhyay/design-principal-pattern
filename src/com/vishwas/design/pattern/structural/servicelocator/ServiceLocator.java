package com.vishwas.design.pattern.structural.servicelocator;

public class ServiceLocator {
    private Cache cache;
    private InitialContext initialContext;

    public ServiceLocator() {
        this.cache = new Cache();
        this.initialContext = new InitialContext();
    }

    public Service getService(String jndiName) {
        Service service = cache.getService(jndiName);
        if (service != null) {
            return service;
        }
        service = initialContext.lookup(jndiName);
        cache.addService(service);
        return service;
    }
}
