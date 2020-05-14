package com.quiterr;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

import java.util.Date;

public class ByeJob implements Job{

    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        System.out.println("Bye geeks! Time is " + new Date());
    }
}

