package src.main.java.ru.gb.lesson6;

import java.util.Objects;

public class Cat {

    // private недоступно никому
    // protected доступно внутри пакета + наследование
    // default доступно внутри пакета
    // public доступно всем

    private final String name; // поле, содержащее имя кота
    private final int appetite; // аппетит кота (столько он съедает за раз)
    private int satiety; // сытость (голодный или нет)

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
        satiety = 5;
    }

    // getter
    public String getName() {
        return name;
    }

    public void eat(Plate plate) {
        if (satiety == 1) {
            return;
        }

        satiety = plate.decreaseFood(appetite);
    }

    @Override
    public String toString() {
        return name + " [" + appetite + "], " + "satiety?" + satiety;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        } else if (obj instanceof Cat anotherCat) {
//            Cat anotherCat = (Cat) obj; // cast
            return name.equals(anotherCat.name);
        }
        return false;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    // if obj1.equals(obj2) => obj1.hashcode() == obj2.hashcode()

    //    // setter
//    public void setName(String catName) {
//        name = catName;
//    }


}
