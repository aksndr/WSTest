package ru.aksndr.server.broker;

public class BtceConnector {
    private static BtceConnector instance = new BtceConnector();

    public static BtceConnector getInstance() {
        return instance;
    }

    private BtceConnector() {
        TickerControl bc = TickerControl.getInstance();
        bc.tickBTCRURForAnHour();
    }
}
