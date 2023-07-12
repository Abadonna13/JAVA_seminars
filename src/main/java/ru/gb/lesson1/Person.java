package src.main.java.ru.gb.lesson1;

public class Person {

    private final Long id;
    private final String name;
    private final Integer age;
    private final Boolean enabled;

    public Person(Long id, String name, Integer age, Boolean enabled) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.enabled = enabled;
    }
//
//    public void setId(Long id) {
//        this.id = id;
//    }
//
//    public Long getId() {
//        return id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public Integer getAge() {
//        return age;
//    }
//
//    public Boolean getEnabled() {
//        return enabled;
//    }
}
