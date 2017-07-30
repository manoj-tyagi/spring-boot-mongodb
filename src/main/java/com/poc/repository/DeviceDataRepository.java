package com.poc.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.poc.domain.DeviceData;

public interface DeviceDataRepository extends MongoRepository<DeviceData, String>{

}
