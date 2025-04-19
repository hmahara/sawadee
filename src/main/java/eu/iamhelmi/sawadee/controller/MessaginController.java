package eu.iamhelmi.sawadee.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import eu.iamhelmi.sawadee.service.MessagePublisher;
import jakarta.servlet.http.HttpServletRequest;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@RestController
@RequestMapping("/api/v1/messaging")
@CrossOrigin
@RequiredArgsConstructor
@Slf4j
public class MessaginController {
	
	private final MessagePublisher messagePublisher;

	@GetMapping ("/test/{topic}")
	public ResponseEntity<String> sendMessage(@PathVariable("topic") String topic, HttpServletRequest request) {
		String remoteHost = request.getRemoteHost();
		String remoteIP = request.getRemoteAddr();
		messagePublisher.publishMessage(topic, "Hardcoded from REST Api. Caller: "+remoteHost+" : "+ remoteIP);
		return ResponseEntity.ok("{\"status\": \"sent\"}");
	}
}
