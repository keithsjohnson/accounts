package uk.co.keithsjohnson.accounts.service.schedule;

import java.time.LocalDateTime;
import java.util.Random;

import org.springframework.jms.core.JmsTemplate;
import org.springframework.scheduling.annotation.Scheduled;

import uk.co.keithsjohnson.accounts.model.Alarm;
import uk.co.keithsjohnson.accounts.model.Severity;

public class NetworkEventSimulator {

	final private JmsTemplate jmsTemplate;
	final private String destination;

	public NetworkEventSimulator(JmsTemplate jmsTemplate, String dest) {
		this.jmsTemplate = jmsTemplate;
		this.destination = dest;
	}

	@Scheduled(fixedRate = 1000L)
	public void simulateActivity() {

		Random random = new Random();

		String hostname;
		switch (random.nextInt(3)) {
		case 0:
			hostname = "router101";
			break;
		case 1:
			hostname = "multiplex205";
			break;
		default:
			hostname = "switch1143";
			break;
		}

		Severity severity;
		switch (random.nextInt(4)) {
		case 0:
			severity = Severity.UP;
			break;
		case 1:
			severity = Severity.DEGRADED;
			break;
		case 2:
			severity = Severity.JEOPARDY;
			break;
		default:
			severity = Severity.DOWN;
			break;
		}
		Alarm event = new Alarm(hostname, LocalDateTime.now(), severity);
		jmsTemplate.convertAndSend(destination, event);
	}

}