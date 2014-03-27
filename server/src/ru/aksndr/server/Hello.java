package ru.aksndr.server;

import javax.jws.WebService;

@WebService(endpointInterface = "ru.aksndr.server.Greetings")
public class Hello implements Greetings {

    @Override
    public String sayHello(String name) {
        String message = "Hello, ";
        return message + name + ".";
    }

}
