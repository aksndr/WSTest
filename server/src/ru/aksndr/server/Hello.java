package ru.aksndr.server;

import ru.aksndr.server.broker.TickerControl;

import javax.jws.WebService;

@WebService(endpointInterface = "ru.aksndr.server.Greetings")
public class Hello implements Greetings {
    TickerControl btce;

    public Hello() {
        btce = TickerControl.getInstance();
    }

    @Override
     public String sayHello(String name) {
        String message = "Hello, ";
        return message + name + ".";
    }

    @Override
    public String getCourse() {
        return btce.getCourse();
    }

}
