package com.example.mainProject.service;

import com.example.mainProject.entity.PassengerEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PassengerService {
@Autowired private RestTemplate restTemplate;

public ResponseEntity<PassengerEntity> savePassenger(PassengerEntity p)
{
    restTemplate.postForEntity("http://localhost:8081/savePassenger", p, PassengerEntity.class);
return ResponseEntity.status(HttpStatus.OK).build();
}
}
