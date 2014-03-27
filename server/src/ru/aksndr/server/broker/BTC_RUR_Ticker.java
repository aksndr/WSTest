package ru.aksndr.server.broker;

import ru.aksndr.server.utils.HttpUtils;

/**
 * User: a.arzamastsev Date: 17.03.14 Time: 17:01
 */
public class BTC_RUR_Ticker implements Runnable {
    private String course;

    @Override
    public void run() {
        String url = "https://btc-e.com/api/2/btc_rur/ticker";
        course = HttpUtils.httpGet(url);
        System.out.println(course);
    }

    public String getCourse(){
        return course;
    }
}
