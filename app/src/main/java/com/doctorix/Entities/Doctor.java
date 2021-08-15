package com.doctorix.Entities;

import lombok.Data;

import javax.persistence.*;
import java.util.List;
/*
 Doctor (one - to - many with Appointment, many-to-many with Office) due to this we
 have list of appointments and list of offices
 */
@Data
@Table(name="doctor")
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    private Long id;
    private String medicalField;
    private String firstName;
    private String lastName;
    private String gender;
    private List<Appointment> appointments;
    private List<Office> office;
}
