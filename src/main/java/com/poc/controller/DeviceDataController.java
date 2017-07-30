package com.poc.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.poc.domain.DeviceData;
import com.poc.service.DeviceDataService;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@RestController
@RequestMapping("/api/device")
public class DeviceDataController {

	@Autowired
	DeviceDataService deviceDataService;

	@ApiOperation(value = "getDeviceData", nickname = "getDeviceData")
	@RequestMapping(method = RequestMethod.GET, path = "/")
	List<DeviceData> findAll() {
		return deviceDataService.findAll();
	}

	@ApiOperation(value = "getDeviceData", nickname = "getDeviceData")
	@ApiResponses(value = { 
			@ApiResponse(code = 200, message = "Success", response = DeviceData.class),
			@ApiResponse(code = 401, message = "Unauthorized"), 
			@ApiResponse(code = 403, message = "Forbidden"),
			@ApiResponse(code = 404, message = "Not Found"), 
			@ApiResponse(code = 500, message = "Failure") })
	@RequestMapping(value = "{id}", method = RequestMethod.GET)
	DeviceData findById(@PathVariable("id") String id) {
		return deviceDataService.findById(id);
	}

	@ApiOperation(value = "createDeviceData", nickname = "createDeviceData")
	@RequestMapping(method = RequestMethod.POST)
	@ResponseStatus(HttpStatus.CREATED)
	DeviceData create(@RequestBody @Valid DeviceData deviceData) {
		return deviceDataService.create(deviceData);
	}

}
