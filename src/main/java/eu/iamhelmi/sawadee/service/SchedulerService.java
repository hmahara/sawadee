package eu.iamhelmi.sawadee.service;

import java.util.Date;

import org.quartz.CronScheduleBuilder;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import eu.iamhelmi.sawadee.task.PeriodicTask;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class SchedulerService {
	
	@Value ("${app.test.cron}")
	private String cron;
	
    private Scheduler scheduler;

    public SchedulerService(Scheduler scheduler) {
        this.scheduler = scheduler;
    }
    
    public void testScheduler() {
    	log.info("***** will reschedule with this cron: "+cron);
    	JobDetail jobDetail = JobBuilder.newJob(PeriodicTask.class)
                .withIdentity("cronJob", "group1")
                .build();
		
		 Trigger trigger = TriggerBuilder.newTrigger()
                 .withIdentity("cronTrigger", "group1")
                 .withSchedule(CronScheduleBuilder.cronSchedule(cron))
                 .build();
		 try {
			scheduler.unscheduleJob(trigger.getKey());
			scheduler.deleteJob(jobDetail.getKey());
			scheduler.scheduleJob(jobDetail, trigger);
		} catch (SchedulerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			log.error(e.getMessage());
		}
    }
    
    public Date getTestNextFiretime() {
    	JobDetail jobDetail = JobBuilder.newJob(PeriodicTask.class)
                .withIdentity("cronJob", "group1")
                .build();
    	try {
    		if (scheduler != null && jobDetail != null && jobDetail.getKey() != null)
    			return scheduler.getTriggersOfJob(jobDetail.getKey()).getFirst().getNextFireTime();
		} catch (SchedulerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	return null;
    }
}

