

import java.util.List;
import java.util.ArrayList;


public class Main {
    public static void main(String[] args) {
        List<Goable> list = new ArrayList<>();


        Cat catty = new Cat();
        Dog goodBoy = new Dog();
        Fish bubble = new Fish();
        Bird duck = new Bird();

        list.add(goodBoy);
        list.add(catty);
        System.out.println(list);
    }
}