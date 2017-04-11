package java8.data;


import java.util.Arrays;
import java.util.List;

public class Data {

    public static List<Person> buildPersonList() {
        return Arrays.asList(
                new Person("Roger", "France", 5, "pass"),
                new Person("Aline", "Deschamps", 35, "pass"),
                new Person("Laurent", "Thomas", 40, "pass"),
                new Person("Chevalier", "France", 19, "pass"),
                new Person("Armor", "France", 25, "pass")
        );

    }
}
