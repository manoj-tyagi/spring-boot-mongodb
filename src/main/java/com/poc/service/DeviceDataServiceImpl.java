package com.poc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.poc.domain.DeviceData;
import com.poc.repository.DeviceDataRepository;

@Service
public class DeviceDataServiceImpl implements DeviceDataService {
	
	@Autowired
	private DeviceDataRepository deviceDataRepository;

	@Override
	public List<DeviceData> findAll() {
		return deviceDataRepository.findAll();
	}

	@Override
	public DeviceData findById(String id) {
		return deviceDataRepository.findOne(id);
	}

	@Override
	public DeviceData create(DeviceData deviceData) {
		return deviceDataRepository.save(deviceData);
	}

}
