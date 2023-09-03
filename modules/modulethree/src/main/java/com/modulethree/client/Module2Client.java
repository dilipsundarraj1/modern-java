package com.modulethree.client;

import com.moduletwo.dtos.Module2DTO;
import com.moduletwo.service.Module2Service;

public class Module2Client {

    private final Module2Service module2Service;

    public Module2Client(Module2Service module2Service) {
        this.module2Service = module2Service;
    }

    public Module2DTO retrieveData(){
        return module2Service.retrieveData();
    }
}
