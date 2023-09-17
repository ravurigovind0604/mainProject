package com.example.mainProject.service;

import com.example.mainProject.DTO.BookingAndPassengerDTO;
import com.example.mainProject.entity.BookingEntity;
import com.example.mainProject.entity.PassengerEntity;
import com.example.mainProject.repo.BookingRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.RequestEntity;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.Optional;

@Service
public class BookingService {
@Autowired
private BookingRepo bookingRepo;

@Autowired private RestTemplate restTemplate;

@Autowired private WebClient webClient;
public ResponseEntity<BookingEntity> saveBooking(BookingEntity b){
    bookingRepo.save(b);
    return ResponseEntity.status(HttpStatus.OK).build();
}


    public ResponseEntity<BookingAndPassengerDTO> showBookingDetails(int id) {
    BookingAndPassengerDTO bookingAndPassengerDTO=new BookingAndPassengerDTO();
    Optional<BookingEntity> bookingEntityOptional= bookingRepo.findById(id);
    BookingEntity bookingEntity = bookingEntityOptional.get();
       bookingAndPassengerDTO.setBookingId(bookingEntity.getBookingId());
       bookingAndPassengerDTO.setBookingStatus(bookingEntity.getBookingStatus());
       bookingAndPassengerDTO.setBookingDateTime(bookingEntity.getBookingDateTime());
       bookingAndPassengerDTO.setPassengerReferenceId(bookingEntity.getPassengerReferenceId());
        int id1= bookingEntity.getPassengerReferenceId();
//            ResponseEntity<PassengerEntity> response=   restTemplate.getForEntity("http://localhost:8081/showPassengerDetails/"+id1,PassengerEntity.class);

            PassengerEntity passengerEntity=  webClient.get().uri("http://localhost:8081/showPassengerDetails/"+id1).retrieve().bodyToMono(PassengerEntity.class).block();
        bookingAndPassengerDTO.setPassengerEntity(passengerEntity);
           return ResponseEntity.status(HttpStatus.OK).body(bookingAndPassengerDTO);
    }
}
