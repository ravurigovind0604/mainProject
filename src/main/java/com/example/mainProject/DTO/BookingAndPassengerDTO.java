package com.example.mainProject.DTO;

import com.example.mainProject.entity.FlightEntity;
import com.example.mainProject.entity.PassengerEntity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import java.util.Date;

public class BookingAndPassengerDTO {
    public int getBookingId() {
        return bookingId;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public Date getBookingDateTime() {
        return bookingDateTime;
    }

    public void setBookingDateTime(Date bookingDateTime) {
        this.bookingDateTime = bookingDateTime;
    }

    public String getBookingStatus() {
        return bookingStatus;
    }

    public void setBookingStatus(String bookingStatus) {
        this.bookingStatus = bookingStatus;
    }


    private int bookingId;
    private Date bookingDateTime;
    private String bookingStatus;

    public int getPassengerReferenceId() {
        return passengerReferenceId;
    }

    public void setPassengerReferenceId(int passengerReferenceId) {
        this.passengerReferenceId = passengerReferenceId;
    }

    private int passengerReferenceId;

    public PassengerEntity getPassengerEntity() {
        return passengerEntity;
    }

    public void setPassengerEntity(PassengerEntity passengerEntity) {
        this.passengerEntity = passengerEntity;
    }

    private PassengerEntity passengerEntity;
    public int getFlightReferenceId() {
        return flightReferenceId;
    }

    public void setFlightReferenceId(int flightReferenceId) {
        this.flightReferenceId = flightReferenceId;
    }

    private int flightReferenceId;

    public FlightEntity getFlightEntity() {
        return flightEntity;
    }

    public void setFlightEntity(FlightEntity flightEntity) {
        this.flightEntity = flightEntity;
    }

    private FlightEntity flightEntity;
    private String firstName;
    private String lastName;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    private int phone;

    private String email;
}
