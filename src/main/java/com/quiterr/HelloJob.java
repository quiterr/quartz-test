package com.quiterr;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import java.util.Date;

/**
 * https://examples.javacodegeeks.com/enterprise-java/quartz/quartz-helloworld-example/
 *
 * @author huangchen 2020/5/8
 */
public class HelloJob implements Job {

    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        System.out.println("Hello geeks! Time is " + new Date());
    }
}
