package com.unisinos.sistemasdistribuidos.NotificationService.impl;

import com.unisinos.sistemasdistribuidos.NotificationService.api.domain.Notification;
import com.unisinos.sistemasdistribuidos.NotificationService.api.repository.NotificationRepository;
import com.unisinos.sistemasdistribuidos.NotificationService.api.service.NotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class NotificationServiceImpl implements NotificationService {

	@Autowired
	private NotificationRepository repository;

	@Override
	public Notification create(Notification notification) {
		notification.setCreatedAt(LocalDateTime.now());
		return repository.save(notification);
	}
}
