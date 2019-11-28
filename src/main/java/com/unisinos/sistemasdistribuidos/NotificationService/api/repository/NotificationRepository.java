package com.unisinos.sistemasdistribuidos.NotificationService.api.repository;

import com.unisinos.sistemasdistribuidos.NotificationService.api.domain.Notification;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface NotificationRepository extends PagingAndSortingRepository<Notification, Long> {
}
