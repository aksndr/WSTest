package ru.aksndr.server;

import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface Greetings {
    @WebMethod
    String sayHello(String name);
}