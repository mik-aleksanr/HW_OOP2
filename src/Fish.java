import java.time.LocalDate;

public class Fish extends Animal {
    public Fish(String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickName, owner, birthDate, illness);
    }

    public Fish() {// eесли создаем объект в main то в классе создаем пустой конструктор
        super();
    }

    @Override
    public void toSwimm() {
        System.out.println("Животное пошло");
    }

    @Override
    public void eat() {
        System.out.println("Собирает корм с поверхности воды");

    }
}
