package clinic.personal;

import clinic.personal.Staff;

import java.time.LocalDate;

public class Doctor extends Staff {
    public Doctor(String fullName, String gender, LocalDate dateOfBirth, String jobTitle) {
        super(fullName, gender, dateOfBirth, jobTitle);
    }

    public Doctor() {
        super();
    }

    public void toInspect() {
        System.out.println("Доктор осматривает животное");
    }

    public void toTreatment() {
        System.out.println("Доктор делает назначение");
    }

}
