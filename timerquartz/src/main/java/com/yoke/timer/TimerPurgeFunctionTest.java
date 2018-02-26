package com.yoke.timer;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Timer;

/**
 * Timer的purge()函数
 * 作用： 从此计时器的任务队列中中移除所有已经取消的任务
 * 返回值： 从队列中移除任务数
 */
public class TimerPurgeFunctionTest {
    public static void main(String[] args) throws InterruptedException {
        Timer timer = new Timer();
        MyTimerTask task1 = new MyTimerTask("test1");
        MyTimerTask task2 = new MyTimerTask("test2");
        Date date = new Date();
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("start time is: " + sf.format(date));
        timer.schedule(task1, 3000, 2000);
        timer.schedule(task2, 1000, 2000);
        System.out.println("current cancle timertask num is : "+timer.purge());
        Thread.sleep(2000);
        task2.cancel();
        System.out.println("current cancle timeTask num is: "+timer.purge());
    }
}
