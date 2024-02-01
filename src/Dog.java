import java.time.LocalDate;

public class Dog extends Animal implements Goable {
    public Dog(String nickName, Owner owner, LocalDate birthDate, Illness illness) {
        super(nickName, owner, birthDate, illness); // Сходи в род.класс и вызови 4 параметра
        // super используется тогода когда в классе наследнике мы хотим использовать
        // конструктор родителя
    }

    public Dog() {// eесли создаем объект в main то в классе создаем пустой конструктор
        super();
    }

    @Override
    public void toGo() {
        System.out.println("Животное пошло");
    }

    @Override
    public void eat() {
        System.out.println("Собака ест еду из миски");
        ;
    }
}
