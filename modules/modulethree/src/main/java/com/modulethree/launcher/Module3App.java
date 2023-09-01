package com.modulethree.launcher;

import com.moduleone.service.Module1Service;
import com.modulethree.client.Module1Client;

public class Module3App {

    public static void main(String[] args) {

        var module1Client = new Module1Client(new Module1Service());
        System.out.println("module1Client data = " + module1Client.retrieveData());
    }
}
