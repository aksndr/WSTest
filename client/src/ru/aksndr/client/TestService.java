package ru.aksndr.client;

import ru.aksndr.server.Hello;

public class TestService {
    public static void main(String[] argv) {
        ru.aksndr.server.Greetings service = new Hello();
        //invoke business method
        System.out.println(service.getCourse());
    }
}