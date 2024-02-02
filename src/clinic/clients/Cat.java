import java.time.LocalDate;

public class Cat extends Animal implements Goable, Swimable {
    Double discount;

    public Cat(String nickName, Owner owner, LocalDate birthDate, Illness illness, Double discount) {
        super(nickName, owner, birthDate, illness);
    }

    public Cat() {
        super();
        this.discount = 10D;
    }

    public Double getDiscount() {
        return discount;
    }

    public void setDiscount(Double discount) {
        this.discount = discount;
    }

    public void meow() {// мяукнула одна кошка
        System.out.println("Мяяяу!");
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
    public String toString() {
        return super.toString() + "Discount(" + discount + ")";
    }

    @Override
    public void eat() {
        System.out.println("Кот поймал мышь и ест");
    }
}
