

import clinic.VeterinaryClinic;
import clinic.clients.*;
import clinic.personal.*;
import clinic.personal.Nurse;


public class Main {
    public static void main(String[] args) {

        VeterinaryClinic clinic = new VeterinaryClinic();
        Cat catty = new Cat();
        Dog goodBoy = new Dog();
        Fish bubble = new Fish();
        Bird duck = new Bird();
        Doctor doctor = new Doctor();
        Nurse nurse = new Nurse();

        catty.toSwimm();
        catty.meow();
        goodBoy.toGo();
        bubble.toSwimm();
        duck.toFly();
        duck.eat();

        doctor.toInspect();
        doctor.toTreatment();
        nurse.toBandage();

        clinic.addWorker(nurse);
        clinic.addWorker(doctor);
        clinic.addPatient(catty);
        clinic.addPatient(goodBoy);
        clinic.addPatient(bubble);
        clinic.addPatient(duck);


        System.out.println("Список Пациентов" + clinic.getAnimals());
        System.out.println("Список персонала" + clinic.getPersonal());
        System.out.println("Эти ходят" + clinic.getGoable());
        System.out.println("Эти плавают" + clinic.getSwimable());
        System.out.println("Эти летают" + clinic.getFlyable());

    }
}