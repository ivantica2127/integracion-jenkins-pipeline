package com.utp.sistema.sales.domain;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClientTest {

    @Test
    public void createClientValid() {
        Client client = new Client();
        client.setId(1);
        client.setFirstName("John");
        client.setLastName("Doe");
        assertEquals("John", client.getFirstName());
        assertEquals("Doe", client.getLastName());
        assertEquals(1, client.getId());
    }

    @Test
    public void setIdInvalid() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            Client client = new Client();
            client.setId(-1);
        });
        String expectedMessage = "Id cannot be negative";
        String actualMessage = exception.getMessage();
        assertTrue(actualMessage.contains(expectedMessage));
    }
}