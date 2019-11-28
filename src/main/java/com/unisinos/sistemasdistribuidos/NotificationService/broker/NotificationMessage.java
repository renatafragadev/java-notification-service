package com.unisinos.sistemasdistribuidos.NotificationService.broker;

import com.unisinos.sistemasdistribuidos.NotificationService.api.domain.PlatformType;

import java.util.Map;

public class NotificationMessage {

	private String title;

	private String description;

	private String publisher;

	private String platformType;

	private Map<String, Object> additionalParams;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getPlatformType() {
		return platformType;
	}

	public void setPlatformType(String platformType) {
		this.platformType = platformType;
	}

	public Map<String, Object> getAdditionalParams() {
		return additionalParams;
	}

	public void setAdditionalParams(Map<String, Object> additionalParams) {
		this.additionalParams = additionalParams;
	}

	@Override
	public String toString() {
		return "NotificationMessage{" +
				"title='" + title + '\'' +
				", description='" + description + '\'' +
				", publisher='" + publisher + '\'' +
				", platformType='" + platformType + '\'' +
				", additionalParams=" + additionalParams +
				'}';
	}
}
