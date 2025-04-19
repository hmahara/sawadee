package eu.iamhelmi.sawadee.controller;

import java.util.Date;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import eu.iamhelmi.sawadee.service.SchedulerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/api/v1/system")
@CrossOrigin
@RequiredArgsConstructor
@Slf4j
public class SystemController {
	
	private final SchedulerService schedulerService;

	@GetMapping ("/version")
	public ResponseEntity<String> getVersion() {
		return ResponseEntity.ok("{\"version\": \"1.0.0\"}");
	}
	
	@GetMapping ("/test-scheduler")
	public ResponseEntity<String> testScheduler() {
		schedulerService.testScheduler();
		return ResponseEntity.ok("{\"status\": \"set example scheduler\"}");
	}
	
	@GetMapping ("/test-next-fire-time")
	public ResponseEntity<String> getNextFiretime() {
		Date d = schedulerService.getTestNextFiretime();
		return ResponseEntity.ok("{\"status\": \""+d.toLocaleString() +"\"}");
	}
}
