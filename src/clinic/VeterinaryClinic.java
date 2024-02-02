package clinic;

import clinic.clients.Animal;
import clinic.clients.Flyable;
import clinic.clients.Goable;
import clinic.clients.Swimable;
import clinic.personal.Staff;

import java.util.ArrayList;
import java.util.List;

public class VeterinaryClinic {
    protected List<Staff> person;
    protected List<Animal> patient;

    public VeterinaryClinic() {
        this.person = new ArrayList<>();
        this.patient = new ArrayList<>();
    }

    public List<Animal> getAnimals() {
        return patient;
    }

    public List<Staff> getPersonal() {
        return person;
    }

    public void addWorker(Staff employee) {
        person.add(employee);
    }

    public void addPatient(Animal animal) {
        patient.add(animal);
    }

    public List<Animal> getGoable() {
        List<Animal> listG = new ArrayList<>();
        for (Animal animal : patient) {
            if (animal instanceof Goable) listG.add(animal);
        }
        return listG;
    }

    public List<Animal> getSwimable() {
        List<Animal> listS = new ArrayList<>();
        for (Animal animal : patient) {
            if (animal instanceof Swimable) listS.add(animal);
        }
        return listS;
    }

    public List<Animal> getFlyable() {
        List<Animal> listF = new ArrayList<>();
        for (Animal animal : patient) {
            if (animal instanceof Flyable) listF.add(animal);
        }
        return listF;
    }

}
