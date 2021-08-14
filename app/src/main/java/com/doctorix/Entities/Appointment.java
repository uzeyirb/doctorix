package com.doctorix.Entities;

import lombok.Data;

import java.time.LocalDate;
import java.time.LocalTime;

/*
Office (one -to - many with Appointment , many-to-many with Doctor) (FK officeId) due to this we
we have entity itself not the list of it
 */
@Data
public class Appointment {
    private Long id;
    private AppointmentType appointmentType;
    private LocalDate appointmentDate;
    private LocalTime appointmentTime;
    private Patient patient;
    private Office office;
    private Doctor doctor;

}
