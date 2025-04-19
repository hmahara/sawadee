package eu.iamhelmi.sawadee;

import org.quartz.CronScheduleBuilder;
import org.quartz.JobBuilder;
import org.quartz.JobDetail;
import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.SchedulerFactory;
import org.quartz.Trigger;
import org.quartz.TriggerBuilder;
import org.quartz.impl.StdSchedulerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import eu.iamhelmi.sawadee.task.PeriodicTask;

@SpringBootApplication
public class SawadeeApplication {
	

	public static void main(String[] args) throws SchedulerException {
		SpringApplication.run(SawadeeApplication.class, args);

	}


}
