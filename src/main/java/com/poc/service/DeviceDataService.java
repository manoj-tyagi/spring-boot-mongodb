package com.poc.service;

import java.util.List;

import com.poc.domain.DeviceData;

public interface DeviceDataService {

	List<DeviceData> findAll();

	DeviceData findById(String id);

	DeviceData create(DeviceData deviceData);

}
