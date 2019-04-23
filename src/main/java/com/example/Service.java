package com.example;

import java.util.Iterator;
import java.util.ServiceLoader;

public abstract class Service 
{
    public static final Service newInstance()
    {
        Iterator<Service> services = ServiceLoader.load(Service.class).iterator();

        return services.hasNext() ? services.next() : null;
    }
}
