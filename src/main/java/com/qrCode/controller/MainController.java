package com.qrCode.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.qrCode.entity.QR_Data;
import com.qrCode.service.QR_Service;

@RestController
@RequestMapping("/")
public class MainController {
	final private QR_Service service;

	public MainController(QR_Service service) {
		this.service = service;
	}

	@PostMapping
	private ResponseEntity<Boolean> saveQRdata(@RequestBody QR_Data data) {
		return ResponseEntity.ok().body(service.saveData(data));

	}

}
