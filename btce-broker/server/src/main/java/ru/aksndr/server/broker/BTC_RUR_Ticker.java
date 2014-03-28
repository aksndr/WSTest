package ru.aksndr.server.broker;

import ru.aksndr.server.utils.HttpUtils;

/**
 * User: a.arzamastsev Date: 17.03.14 Time: 17:01
 */
public class BTC_RUR_Ticker implements Runnable {
    private static String course;
    private int lap;

    @Override
    public void run() {
        String url = "https://btc-e.com/api/2/btc_rur/ticker";
        course = HttpUtils.httpGet(url);
        setCourse(course);

        System.out.println(++lap + " " +course);
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
