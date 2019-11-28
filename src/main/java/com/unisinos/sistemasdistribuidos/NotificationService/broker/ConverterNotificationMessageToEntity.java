package com.unisinos.sistemasdistribuidos.NotificationService.broker;

import com.unisinos.sistemasdistribuidos.NotificationService.api.domain.Notification;
import com.unisinos.sistemasdistribuidos.NotificationService.api.domain.PlatformType;
import org.springframework.stereotype.Component;

@Component
public class ConverterNotificationMessageToEntity {

	public Notification converter(NotificationMessage notificationMessage) {
		Notification notification = new Notification();
		notification.setTitle(notificationMessage.getTitle());
		notification.setDescription(notificationMessage.getDescription());
		notification.setPublisher(notificationMessage.getPublisher());
		notification.setPlatformType(PlatformType.valueOf(notificationMessage.getPlatformType()));
		notification.setAdditionalParams(notificationMessage.getAdditionalParams().toString());
		return notification;
	}
}
