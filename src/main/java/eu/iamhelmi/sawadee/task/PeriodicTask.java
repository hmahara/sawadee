package eu.iamhelmi.sawadee.task;

import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import eu.iamhelmi.sawadee.service.MessagePublisher;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
//@AllArgsConstructor
public class PeriodicTask implements Job{
	
	@Autowired
	private  MessagePublisher messagePublisher;
	
	@Value ("${app.test.cron}")
	private String cron;
	
	@Value ("${kafka.enabled}")
	private String kafkaEnabled;
	
	@Value("${spring.datasource.url}")
    private String datasourceUrl;
	
	@Value("${spring.datasource.driverClassName}")
    private String driverClassName;

    @Value("${spring.datasource.username}")
    private String datasourceUsername;

    @Value("${spring.datasource.password}")
    private String datasourcePassword;


	@Override
	public void execute(JobExecutionContext context) throws JobExecutionException {
      log.info(MessageFormat.format("Periodic task: {0}; Thread: {1}",
	                new Date().toString(), Thread.currentThread().getName()));
	        log.info("cron: {}", cron);
	        log.info("datasourceUrl: {} ", datasourceUrl);
	        log.info("kafka.enabled: {} ", kafkaEnabled);
//	        log.info("datasourceUsername: {} ", datasourceUsername);
//	        log.info("datasourcePassword: {} ", datasourcePassword);
//	        log.info("driverClassName: {} ", driverClassName);
	        Date currentDate = new Date();
	        SimpleDateFormat dateFormat = new SimpleDateFormat("dd MMM yyyy HH:mm:ss");
	        String formattedDate = dateFormat.format(currentDate);
	  messagePublisher.publishMessage("quickstart", "periodicTask at "+ formattedDate);
//		
	}
}
