package com.yoke.timer;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.TimerTask;

/**
 * 创建TimerTask
 * TimeraaaTask的两个函数：
 * 1. cancle() : 作用： 取消当前Timetask的任务
 * 2. scheduledExcutionTime() 作用： 返回此任务最近实际执行的已安排执行时间
 */
public class MyTimerTask extends TimerTask {
    private String name;

    public MyTimerTask(String inputName) {
        name = inputName;
    }

    // 打印当前name的内容
    @Override
    public void run() {
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat sf = new SimpleDateFormat("yyyy-MM-dd HH:mm；ss");
        System.out.println("Current exec time is： "+sf.format(calendar.getTime()));
        System.out.println("current exec name is: " + name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
