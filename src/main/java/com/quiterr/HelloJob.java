package com.quiterr;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

/**
 * https://examples.javacodegeeks.com/enterprise-java/quartz/quartz-helloworld-example/
 *
 * @author huangchen 2020/5/8
 */
public class HelloJob implements Job {
    private HelloService hs = new HelloService();

    public void execute(JobExecutionContext context) throws JobExecutionException {
        hs.sayHello();
    }
}
