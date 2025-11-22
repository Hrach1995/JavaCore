
package medicalCenter;

import java.time.*;

public class Patient extends Person {

    private Doctor doctor;
    private LocalDateTime registrDateTime;

    public Patient(String id, String name, String surname, String phone, Doctor doctor, LocalDateTime registrDateTime) {
        super(id, name, surname, phone);
        this.doctor = doctor;
        this.registrDateTime = registrDateTime;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

    public LocalDateTime getRegistrDateTime() {
        return registrDateTime;
    }

    public void setRegistrDateTime(LocalDateTime registrDateTime) {
        this.registrDateTime = registrDateTime;
    }

    @Override
    public String toString() {
        return "Patient: " + super.toString() + String.format(", doctor = %s %s, date time : %s",
                doctor.getName(),doctor.getSurname(), registrDateTime);


    }
}
