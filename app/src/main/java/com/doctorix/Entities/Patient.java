package com.doctorix.Entities;

import lombok.Data;

import java.time.LocalDate;
import java.util.List;
/*
 Patient (one - to - many with Appointment) (FK patientID) that is why
 we have list of appointments
 */
@Data
public class Patient {
    private Long id;
    private String firstName;
    private String lastName;
    private String gender;
    private LocalDate dateOfBirth;
    private String patientStreetAddress;
    private String patientCity;
    private String patientState;
    private Long patientZip;
    private String phoneNumber;
    private String patientEmail;
    private List<Appointment> appointments;
}
