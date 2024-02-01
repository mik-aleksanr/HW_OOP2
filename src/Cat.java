import java.time.LocalDate;

public class Cat extends Animal implements Goable {
    Double discount;

    public Cat(String nickName, Owner owner, LocalDate birthDate, Illness illness, Double discount) {
        super(nickName, owner, birthDate, illness); // сначала вызываем конструктор Супер-класса
        this.discount = discount;// далее новые поля
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

    // Todo статикой пользоваться аккуратно ( пароли там не хранить), методы statik
    // инициируются еще до запуска программы и занимают память поэтому если метод
    // не нужен для запуска статиком его делать не нужно
    // public static void meow() { //мяукнули все коты приложения
    public void meow() {// мяукнула одна кошка
        System.out.println("Мяяяу!");
    }

    @Override
    public void toGo() {
        System.out.println("Животное пошло");
    }

    @Override
    public String toString() {
        return super.toString() + "Discount(" + discount + ")";
    }

    // так как Cat является наследником Animal он должен реализовать его абстрактный
    // метод, тут уже и прописывается как конкретно ест кот, но если наследник
    // абстрактный то этот метод в нем можно не реализовывать
    @Override
    public void eat() {
        System.out.println("Кот поймал мышь и ест");
    }
}
