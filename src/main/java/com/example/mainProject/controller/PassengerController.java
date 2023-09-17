package com.example.mainProject.controller;

import com.example.mainProject.entity.PassengerEntity;
import com.example.mainProject.service.PassengerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PassengerController {
   @Autowired
   private PassengerService passengerService;
    @PostMapping("/savePassenger")
    ResponseEntity<PassengerEntity> savePassenger(@RequestBody PassengerEntity p)
    {
        passengerService.savePassenger(p);
        return ResponseEntity.status(HttpStatus.OK).body(p);
    }
}
