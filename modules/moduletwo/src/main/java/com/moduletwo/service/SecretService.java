package com.moduletwo.service;


import com.moduleone.secret.Secret;

public class SecretService {

    private final Secret secret;

    public SecretService(Secret secret) {
        this.secret = secret;
    }

    public String secret(){
        return secret.secret();
    }
}
