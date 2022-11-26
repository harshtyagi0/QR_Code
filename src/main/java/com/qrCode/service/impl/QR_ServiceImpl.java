package com.qrCode.service.impl;

import org.springframework.stereotype.Service;

import com.qrCode.entity.QR_Data;
import com.qrCode.repository.QR_repository;
import com.qrCode.service.QR_Service;

@Service
public class QR_ServiceImpl implements QR_Service {

	final private QR_repository repository;

	public QR_ServiceImpl(QR_repository repository) {
		this.repository = repository;
	}

	@Override
	public boolean saveData(QR_Data data) {
		try {
			repository.save(data);
			return true;
		} catch (Exception e) {
			e.printStackTrace();

		}
		return false;
	}

}
