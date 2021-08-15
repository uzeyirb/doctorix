package com.doctorix.Entities;

import lombok.Data;

import javax.persistence.*;
import java.util.List;
/*
Office (one -to - many with Appointment , many-to-many with Doctor) (FK officeId)
due to this we have list of the appointments
 */
@Data
@Table(name="office")
public class Office {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="id")
    @ManyToMany
    @JoinColumn(name = "patient", nullable = false)

    private Long id;
    private String officeName;
    private String officeStreetAddress;
    private String officeCity;
    private String officeState;
    private Long officeZip;
    private String officePhone;
    private String officeEmail;
    private String officeHours;
    private String officeParking;
    private String additionalInfo;
    private String officeUrl;
    private List<Appointment> appointments;
}
