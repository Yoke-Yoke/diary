package com.yoke.timer;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Timer;

/**
 * 比较timer的schedule与scheduleAtFixedRate函数的区别
 * 区分一： 首次执行时间早于当前时间的情况
 * schedule() : 会以当前时间,频率执行
 * scheduleAtFixedRate(): 会在当前时间高并发赶上进度，然后继续按照频率执行
 */
public class DifferenceTest1 {
    public static void main(String[] args) {
//        schedule();
        scheduleAtFixedRate();
    }

    private static void schedule() {
        final SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Calendar calendar = Calendar.getInstance();
        System.out.println("the current time is:" + sf.format(calendar.getTime()));
        calendar.add(Calendar.SECOND, -6);
        Timer timer = new Timer();
        MyTimerTask timerTask = new MyTimerTask("test");
        timer.schedule(timerTask, calendar.getTime(), 2000);
    }

    private static void scheduleAtFixedRate() {
        final SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Calendar calendar = Calendar.getInstance();
        System.out.println("the current time is:" + sf.format(calendar.getTime()));
        calendar.add(Calendar.SECOND, -6);
        Timer timer = new Timer();
        MyTimerTask myTimerTask = new MyTimerTask("test2");
        timer.scheduleAtFixedRate(myTimerTask, calendar.getTime(), 2000);

    }
}
