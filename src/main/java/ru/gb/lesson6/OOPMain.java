package src.main.java.ru.gb.lesson6;

import java.util.HashSet;

public class OOPMain {

    public static void main(String[] args) {

        Cat murzik = new Cat("Murzik", 150);
        Plate plate = new Plate(50);
        Plate plate1 = new Plate(75);

        System.out.println(murzik);
        System.out.println(plate);
        System.out.println(plate1);

        murzik.eat(plate);
        //murzik.eat(plate);

        System.out.println(murzik);
        System.out.println(plate);
        System.out.println(plate1);

        murzik.eat(plate1);

        System.out.println(murzik);
        System.out.println(plate);
        System.out.println(plate1);


//        Cat first = new Cat("Name", 150);
//        Cat second = new Cat("Name", 100);
//
//        System.out.println(first == second); // false
//        System.out.println(first.equals(second));
//
//        System.out.println(first.hashCode());
//        System.out.println(second.hashCode());
//
//        HashSet<Cat> cats = new HashSet<>();
//        cats.add(first);
//        cats.add(second);
//        System.out.println(cats);

    }

}
