package com.qrCode.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.qrCode.entity.QR_Data;

@Repository
public interface QR_repository extends MongoRepository<QR_Data, String> {

}
