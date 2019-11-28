package com.unisinos.sistemasdistribuidos.NotificationService;

import com.unisinos.sistemasdistribuidos.NotificationService.api.domain.Notification;
import com.unisinos.sistemasdistribuidos.NotificationService.broker.NotificationMessage;
import org.springframework.amqp.support.converter.DefaultClassMapper;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.HashMap;
import java.util.Map;

@Configuration
public class RabbitMqConfig {

	@Bean
	public MessageConverter messageConverter() {
		Jackson2JsonMessageConverter jsonMessageConverter = new Jackson2JsonMessageConverter();
		jsonMessageConverter.setClassMapper(classMapper());
		return jsonMessageConverter;
	}

	@Bean
	public DefaultClassMapper classMapper() {
		DefaultClassMapper classMapper = new DefaultClassMapper();
		Map<String, Class<?>> idClassMapping = new HashMap<>();
		idClassMapping.put("NotificationMessage", NotificationMessage.class);
		classMapper.setIdClassMapping(idClassMapping);
		return classMapper;
	}
}
