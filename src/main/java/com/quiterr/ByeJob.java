package com.quiterr;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public class ByeJob implements Job{

    private ByeService bs = new ByeService();

    public void execute(JobExecutionContext context) throws JobExecutionException {
        bs.sayGoodbye();
    }
}

