package com.doctorix.Entities;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;
/*
 Patient (one - to - many with Appointment) (FK patientID) that is why
 we have list of appointments
 */
@Data
@Table(name="patient")
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    @OneToMany(mappedBy = "patient")
    private Long id;

    @Column(name="firstName")
    private String firstName;
    @Column(name="lastName")
    private String lastName;
    @Column(name="gender")
    private String gender;
    @Column(name="dateOfBirth")
    private LocalDate dateOfBirth;
    @Column(name="patientStreetAddress")
    private String patientStreetAddress;
    @Column(name="patientCity")
    private String patientCity;
    @Column(name="patientState")
    private String patientState;
    @Column(name="patientZip")
    private Long patientZip;
    @Column(name="phoneNumber")
    private String phoneNumber;
    @Column(name="patientEmail")
    private String patientEmail;

    private List<Appointment> appointments;
    private List<Office> office;
}
