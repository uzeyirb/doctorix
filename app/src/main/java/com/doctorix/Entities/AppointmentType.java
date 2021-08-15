package com.doctorix.Entities;

import lombok.Data;

import javax.persistence.Table;

@Data
@Table(name="AppointmentType")
public enum AppointmentType {

    Consultation,
<<<<<<< Updated upstream

=======
>>>>>>> Stashed changes
    Vaccination,
    Surgery,
    Test,
    Routine,
}
