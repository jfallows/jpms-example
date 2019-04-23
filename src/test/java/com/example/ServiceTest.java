package com.example;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

public class ServiceTest 
{
    @Test
    public void shouldInstantiate()
    {
        Service service = Service.newInstance();

        assertNotNull(service);;
    }
}
