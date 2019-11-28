package com.unisinos.sistemasdistribuidos.NotificationService.broker;

import com.unisinos.sistemasdistribuidos.NotificationService.api.domain.Notification;
import com.unisinos.sistemasdistribuidos.NotificationService.api.service.NotificationService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@RabbitListener(queues = "${rabbitmq.queues.notification-create}")
public class NotificationConsumer {

	private final Logger log = LoggerFactory.getLogger(this.getClass());

	private ConverterNotificationMessageToEntity notificationMessageToEntity;

	private NotificationService notificationService;

	@Autowired
	public NotificationConsumer(ConverterNotificationMessageToEntity notificationMessageToEntity,
	                            NotificationService notificationService) {
		this.notificationMessageToEntity = notificationMessageToEntity;
		this.notificationService = notificationService;
	}

	@RabbitHandler
	public void receive(NotificationMessage notificationMessage) {
		log.info("NotificationConsumer: receive -> notificationMessage - {} ", notificationMessage);
		Notification notification = notificationMessageToEntity.converter(notificationMessage);
		notificationService.create(notification);
	}
}