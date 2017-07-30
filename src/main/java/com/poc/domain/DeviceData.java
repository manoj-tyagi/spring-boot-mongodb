package com.poc.domain;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "devices")
public class DeviceData implements Serializable {
	private static final long serialVersionUID = -947840949974030475L;

	@Id
	private String id;
	
	private int temperature;
	
	private int humidity;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getTemperature() {
		return temperature;
	}

	public void setTemperature(int temperature) {
		this.temperature = temperature;
	}

	public int getHumidity() {
		return humidity;
	}

	public void setHumidity(int humidity) {
		this.humidity = humidity;
	}
	
}
