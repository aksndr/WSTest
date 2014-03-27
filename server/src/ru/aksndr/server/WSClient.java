package ru.aksndr.server;

import javax.xml.ws.Endpoint;

public class WSClient {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8080/services/Hello", new Hello());
    }
}
