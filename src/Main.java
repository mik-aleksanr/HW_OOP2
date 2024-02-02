

import clinic.clients.*;
import clinic.personal.Doctor;
import clinic.personal.Nurse;

import java.util.List;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        List<Goable> listG = new ArrayList<>();
        List<Swimable> listS = new ArrayList<>();
        List<Swimable> listF = new ArrayList<>();

        Cat catty = new Cat();
        Dog goodBoy = new Dog();
        Fish bubble = new Fish();
        Bird duck = new Bird();
        Doctor doctor = new Doctor();
        Nurse nurse = new Nurse();

        listG.add(goodBoy);
        listG.add(catty);
        listG.add(duck);
        listS.add(bubble);
        listS.add(duck);
        listS.add(catty);
        listS.add(goodBoy);
        listF.add(duck);

        System.out.println(listG);
        System.out.println(listS);
        System.out.println(listF);

        catty.toSwimm();
        catty.meow();
        goodBoy.toGo();
        goodBoy.toSwimm();
        duck.toFly();
        goodBoy.eat();
        bubble.eat();
        duck.eat();

        doctor.toInspect();
        doctor.toTreatment();
        nurse.toBandage();


    }
}