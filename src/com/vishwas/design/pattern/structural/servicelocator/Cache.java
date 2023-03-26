package com.vishwas.design.pattern.structural.servicelocator;

import java.util.ArrayList;
import java.util.Optional;

public class Cache {
    private ArrayList<Service> services;

    public Cache() {
        services = new ArrayList<>();
    }

    public Service getService(String jndiName) {
        Optional<Service> service = services.stream().filter(s -> s.getServiceName().equals(jndiName))
                .findFirst();

        if (service.isPresent()) {
            return service.get();
        }
        return null;
    }

    public void addService(Service service) {
        services.add(service);
    }
}
