package com.example.test;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.junit.jupiter.api.Test;

import com.example.Service;

public class ServiceTest 
{
    @Test
    public void shouldInstantiate()
    {
        Service service = Service.newInstance();

        assertNotNull(service);;
    }
}
