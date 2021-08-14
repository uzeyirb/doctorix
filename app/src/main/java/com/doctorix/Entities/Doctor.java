package com.doctorix.Entities;

import java.util.List;
/*
 Doctor (one - to - many with Appointment, many-to-many with Office) due to this we
 have list of appointments and list of offices
 */
public class Doctor {
    private Long id;
    private String medicalField;
    private String firstName;
    private String lastName;
    private String gender;
    private List<Appointment> appointments;
    private List<Office> office;
}
