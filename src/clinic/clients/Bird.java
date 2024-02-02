package clinic.clients;

import java.time.LocalDate;

public class Bird extends Animal implements Goable, Swimable, Flyable {
    public Bird(String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickName, owner, birthDate, illness); // Сходи в род.класс и вызови 4 параметра
        // super используется тогода когда в классе наследнике мы хотим использовать
        // конструктор родителя
    }

    public Bird() {// eесли создаем объект в main то в классе создаем пустой конструктор
        super();
    }


    @Override
    public void toGo() {
        System.out.println("Животное пошло");
    }

    @Override
    public double getRunSpeed() {
        return Goable.super.getRunSpeed();
    }

    @Override
    public void toSwimm() {
        System.out.println("Животное поплыло");
    }

    @Override
    public double getSwimmSpeed() {
        return Swimable.super.getSwimmSpeed();
    }

    @Override
    public void toFly() {
        System.out.println("Животное полетело");
    }

    @Override
    public double getFlySpeed() {
        return Flyable.super.getFlySpeed();
    }

}
