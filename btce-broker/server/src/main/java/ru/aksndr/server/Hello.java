package ru.aksndr.server;

import ru.aksndr.server.broker.BTC_RUR_Ticker;

import javax.jws.WebService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;

import static java.util.concurrent.TimeUnit.SECONDS;

@WebService(endpointInterface = "ru.aksndr.server.Greetings")
public class Hello implements Greetings {
    private final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(5);
    static BTC_RUR_Ticker ticker;
    String course;

    public Hello() {
        tickBTCRURForAnHour();
//        btce = TickerControl.getInstance();
    }

    @Override
    public String sayHello(String name) {
        String message = "Hello, ";
        return message + name + ".";
    }

    @Override
    public String getCourse() {
        return ticker.getCourse();
    }

    public void tickBTCRURForAnHour() {
        ticker = new BTC_RUR_Ticker();
        final ScheduledFuture<?> tickerHandle = scheduler.scheduleAtFixedRate(ticker, 0, 15, SECONDS);

        scheduler.schedule(new Runnable() {
            public void run() {
                tickerHandle.cancel(true);
            }
        }, 60 * 60, SECONDS);
    }

}
