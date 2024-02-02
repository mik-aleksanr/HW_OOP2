import java.time.LocalDate;

public class Dog extends Animal implements Goable, Swimable {
    public Dog(String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickName, owner, birthDate, illness);
    }

    public Dog() {// eесли создаем объект в main то в классе создаем пустой конструктор
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
    public void eat() {
        System.out.println("Собака ест еду из миски");

    }
}
