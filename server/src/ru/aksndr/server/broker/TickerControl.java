package ru.aksndr.server.broker; /**
 * User: a.arzamastsev Date: 13.03.14 Time: 15:11
 */

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;

import static java.util.concurrent.TimeUnit.SECONDS;
public class TickerControl {

    private static TickerControl instance;

    public static TickerControl getInstance() {
        if (instance==null)
            instance = new TickerControl();
        return instance;
    }

    private TickerControl() {
        tickBTCRURForAnHour();
    }

    private final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(5);
    static BTC_RUR_Ticker ticker;

    public void tickBTCRURForAnHour() {
        ticker = new BTC_RUR_Ticker();
        final ScheduledFuture<?> tickerHandle = scheduler.scheduleAtFixedRate(ticker, 0, 15, SECONDS);

        scheduler.schedule(new Runnable() {
            public void run() { tickerHandle.cancel(true); }
        }, 60 * 60, SECONDS);
    }

    public String getCourse(){
        return ticker.getCourse();
    }

}


