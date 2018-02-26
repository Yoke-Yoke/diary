package com.yoke.timer;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;

/**
 *Timer的cancle函数
 * 终止此计时器，丢弃所有当前的所有任务
 */
public class CancleTest {
    public static void main(String[] args) throws InterruptedException {
        Timer timer = new Timer();
        MyTimerTask task1 = new MyTimerTask("test1");
        MyTimerTask task2 = new MyTimerTask("test2");
        Date date = new Date();
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("start time is: " + sf.format(date));
        timer.schedule(task1, 3000, 2000);
        timer.schedule(task2, 1000, 2000);
        Thread.sleep(5000);
        Date cancleTime = new Date();
        System.out.println("cancle time is : " + sf.format(cancleTime));
        timer.cancel();
        System.out.println("timer cancle!");
    }
}
