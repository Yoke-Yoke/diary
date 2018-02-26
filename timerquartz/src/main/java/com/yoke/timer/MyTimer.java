package com.yoke.timer;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Timer;

/**
 * 主要介绍Timer的schedule函数以及shceduleAtFixedRate函数的用法
 */
public class MyTimer {
    public static void main(String[] args) {
        // 1.创建Timer实例
        Timer timer = new Timer();
        // 2.创建一个MyTimerTask的实例
        MyTimerTask myTimerTask = new MyTimerTask("test");
        // 3.通过Timer 定时定频率的调用myTimerTask
        // 即第一次执行是在当前时间的2秒钟之后，之后每隔一秒执行一次
//        timer.schedule(myTimerTask, 2000L, 1000L);
//        scheduleFunctionTest1(timer, myTimerTask);
//        scheduleFunctionTest2(timer, myTimerTask);
        scheduleFunctionTest3(timer, myTimerTask);
    }

    /**
     * schedule函数的第一种用法:
     * schedule(task,time)
     * 作用： 在时间等于或者超过time的时候执行且只执行一次task
     */
    private static void scheduleFunctionTest1(Timer timer, MyTimerTask myTimerTask) {
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sf.format(calendar.getTime()));
        // 设置calendar的时间为3秒之后
        calendar.add(Calendar.SECOND, 3);
        myTimerTask.setName("schedule1");
        timer.schedule(myTimerTask, calendar.getTime());
    }

    /**
     * schedule函数第二种用法
     * schedule(task,time,period)
     * 参数： task: 所要安排的任务
     * time:首次执行任务的时间
     * period: 执行一次task的时间间隔，单位是毫秒
     * 作用： 时间等于或者超过time时间首次执行task,之后每隔period毫秒重复执行一次task
     */
    private static void scheduleFunctionTest2(Timer timer, MyTimerTask myTimerTask) {
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sf.format(calendar.getTime()));
        // 设置calendar的时间为3秒之后
        calendar.add(Calendar.SECOND, 3);
        myTimerTask.setName("schedule2");
        timer.schedule(myTimerTask, calendar.getTime(), 2000);
    }

    /**
     * schedule函数的第三种用法
     * schedule(task,delay)
     * 参数： task: 所要安排的任务
     * delay: 执行任务之前的延时，单位是毫秒
     * 作用: 等待delay毫秒之后执行且只执行一次task
     */
    private static void scheduleFunctionTest3(Timer timer, MyTimerTask mytimerTask) {
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sf.format(calendar.getTime()));
        // 设置calendar的时间为3秒之后
        calendar.add(Calendar.SECOND, 3);
        mytimerTask.setName("schedule3");
        timer.schedule(mytimerTask, 2000);
    }

    /**
     * schedule函数的第四种用法
     * schedule(task,delay,period)
     * 参数: task: 所要安排的任务
     * delay: 执行任务之前的延时
     * period: 执行一次task的时间间隔，单位是毫秒
     * 作用： 等待delay毫秒之后首次执行task,之后每隔period毫秒后执行一次task
     */
    private static void scheduleFunctionTest(Timer timer, MyTimerTask myTimerTask) {
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sf.format(calendar.getTime()));
        myTimerTask.setName("schedule4");
        timer.schedule(myTimerTask, 3000, 2000);
    }

    /**
     * scheduleAtFixedRate函数的第一种用法
     * scheduleAtFixedRate(task,time,period)
     * 参数： 与schedule参数类似
     * 功能： 时间等于或者超过time后首次执行task,之后每隔period毫秒之后重复执行一次task
     */
    private static void scheduleAtFixedRateFunctionTest1(Timer timer, MyTimerTask mytimerTask) {
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sf.format(calendar.getTime()));
        mytimerTask.setName("scheduleAtFixedRate1");
        timer.scheduleAtFixedRate(mytimerTask, calendar.getTime(), 2000);
    }

    /**
     * scheduleAtFixedRate函数的第二种用法
     * scheduleAtFixedRate(task,delay,period)
     * 参数: 与schedule参数类似
     * 功能： 等待delay毫秒之后，间隔为period毫秒执行一次task
     */
    private static void scheduleAtFixedRateFunctionTest2(Timer timer, MyTimerTask myTimerTask) {

        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println(sf.format(calendar.getTime()));
        myTimerTask.setName("scheduleAtFixedRate2");
        timer.scheduleAtFixedRate(myTimerTask,3000,2000);
    }
}
