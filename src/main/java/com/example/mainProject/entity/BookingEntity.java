package com.example.mainProject.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@AllArgsConstructor
@NoArgsConstructor
public class BookingEntity {
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

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int bookingId;
    private Date bookingDateTime;
    private String bookingStatus;

    private int passengerReferenceId;

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
    public int getFlightReferenceId() {
        return flightReferenceId;
    }

    public void setFlightReferenceId(int flightReferenceId) {
        this.flightReferenceId = flightReferenceId;
    }

    private int flightReferenceId;

    public int getPassengerReferenceId() {
        return passengerReferenceId;
    }

    public void setPassengerReferenceId(int passengerReferenceId) {
        this.passengerReferenceId = passengerReferenceId;
    }
}
