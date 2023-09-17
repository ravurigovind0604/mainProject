package com.example.mainProject.controller;

import com.example.mainProject.DTO.BookingAndPassengerDTO;
import com.example.mainProject.entity.BookingEntity;
import com.example.mainProject.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class BookingController {
   @Autowired
   private BookingService bookingService;
    @PostMapping("/saveBooking")
    ResponseEntity<BookingEntity> saveBooking(@RequestBody BookingEntity b){
        bookingService.saveBooking(b);
        return ResponseEntity.status(HttpStatus.OK).body(b);
    }

    @GetMapping("/showBookingDetails/{id}")
    ResponseEntity<BookingAndPassengerDTO> showBookingDetails(@PathVariable int id){
        ResponseEntity<BookingAndPassengerDTO> bookingAndPassengerDTO= bookingService.showBookingDetails(id);
        return ResponseEntity.status(HttpStatus.OK).body(bookingAndPassengerDTO.getBody());
    }
}
