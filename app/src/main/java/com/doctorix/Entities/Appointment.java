package com.doctorix.Entities;

import lombok.Data;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalTime;

/*
Office (one -to - many with Appointment , many-to-many with Doctor) (FK officeId) due to this we
we have entity itself not the list of it
 */
@Data
@Table(name="appointment")
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    @ManyToMany
    @JoinColumn(name = "patient", nullable = false)
    private Long id;
    private AppointmentType appointmentType;
    private LocalDate appointmentDate;
    private LocalTime appointmentTime;
    private Patient patient;
    private Office office;
    private Doctor doctor;

}
