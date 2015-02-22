package uk.co.keithsjohnson.accounts.config;

import javax.jms.ConnectionFactory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.listener.SimpleMessageListenerContainer;
import org.springframework.jms.listener.adapter.MessageListenerAdapter;
import org.springframework.scheduling.annotation.EnableScheduling;

import uk.co.keithsjohnson.accounts.service.schedule.NetworkEventConsumer;
import uk.co.keithsjohnson.accounts.service.schedule.NetworkEventSimulator;

@Configuration
@EnableScheduling
public class JMSConfiguration {

	private static final String MAILBOX = "events";

	@Bean
	MessageListenerAdapter adapter(NetworkEventConsumer consumer) {
		MessageListenerAdapter adapter = new MessageListenerAdapter(consumer);
		adapter.setDefaultListenerMethod("process");
		return adapter;
	}

	@Bean
	SimpleMessageListenerContainer container(MessageListenerAdapter adapter, ConnectionFactory factory) {
		SimpleMessageListenerContainer container = new SimpleMessageListenerContainer();
		container.setMessageListener(adapter);
		container.setConnectionFactory(factory);
		container.setDestinationName(MAILBOX);
		return container;
	}

	@Bean
	NetworkEventSimulator simulator(JmsTemplate jmsTemplate) {
		return new NetworkEventSimulator(jmsTemplate, MAILBOX);
	}

}