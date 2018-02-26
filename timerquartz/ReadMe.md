<h1> 学习Timer和Quartz</h1>
<h2>Timer的学习</h2>
  定义： 有且仅有一个后台线程对多个业务线程进行定时定频率的调度<br/>
  主要构件： Timer __定时调用____TimerTask<br/>
  总结： <br/>
<pre>
    1.首先创建一个定时任务
        创建MyTimerTask类继承TimerTask，覆盖掉run方法
    2.创建Timer实例，调用schedule方法，设置相关配置
    3.Timer的几个常用函数：
        (1) schedule()函数
            a. schedule(task,time)
                参数： task: 所要安排的任务
                       time: 首次执行任务的时间
                作用：  在时间等于或者超过time的时候执行且只执行一次task
            b. schedule(task,time,period)
                参数：   task: 所要执行的任务
                        time： 首次执行任务的时间
                        period: 执行一次task的时间间隔，单位是毫秒
                作用： 时间等于或者超过time时间首次执行task,之后每隔period毫秒重复执行一次task
            c. schedule(task,delay)
                参数： task: 所要执行的任务
                       delay: 执行任务之前要等待的时间
                作用： 等待delay毫秒之后执行且只执行一次
            d. schedule(task,delay,period)
                参数： task: 所要执行的任务
                       delay: 执行任务之前要等待的时间
                       period: 执行一次task的时间间隔，单位是毫秒
        (2) scheduleAtFixedRate()函数
            a. scheduleAtFixedRate(task,time,period)
                参数： 与schedule参数类似
                功能： 时间等于或者超过time后首次执行task,之后每隔period毫秒之后重复执行一次task
            b. scheduleAtFixedRate(task,delay,period)
                参数： 与schedule参数类似
                功能： 等待delay毫秒之后，间隔为period毫秒执行一次task  
        (3) cancle() 函数
            功能: 终止计时器，丢弃所有当前的所有任务
        (4) purge() 函数
            功能： 从此计时器的任务队列中中移除所有已经取消的任务
            返回值：从队列中移除任务数    
    4. TimerTask的两个常用函数
        (1) cancle()
            功能： 取消当前TimeTask的任务
        (2) scheduleExcutionTime()
            功能： 返回此任务最近实际执行的已安排执行时间
    5.Timer类的schedule函数与scheduleAtFixedRate函数的区别
        区别体现在两种情况：
            （1） 当首次执行时间早于当前时间的情况
                a. schedule函数： 会以当前时间和频率执行
                b. scheduleAtFixedRate函数： 具有并发的效果，会在当前时间并发赶上进度，然后继续按照设置的频率执行
                        
</pre>

  
  

