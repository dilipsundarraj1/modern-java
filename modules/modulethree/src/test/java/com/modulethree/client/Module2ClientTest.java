package com.modulethree.client;

import com.moduleone.service.Module1Service;
import com.moduletwo.client.Module1Client;
import com.moduletwo.service.Module2Service;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class Module2ClientTest {

    Module2Service module2Service = new Module2Service();
    Module2Client module2Client = new Module2Client(module2Service);
    @Test
    void retrieveData() {

        var module2DTO = module2Client.retrieveData();
        assertEquals("Hello! This is from Module2", module2DTO.name());

    }
}