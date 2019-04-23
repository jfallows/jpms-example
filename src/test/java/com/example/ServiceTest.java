package com.example;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;

public class ServiceTest 
{
    @Test
    public void shouldInstantiate()
    {
        Service service = Service.newInstance();

        assertNotNull(service);;
    }
}
