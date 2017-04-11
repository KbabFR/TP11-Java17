package java8.ex04;

import java8.data.Data;
import java8.data.Person;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

/**
 * Exercice 4 - java.util.function.Predicate
 */
public class Function_04_Test {

    // tag::filterMethod[]
   <T> List<T> filter(List<T> list, Predicate<T> predicate) {
       List<T> result = new ArrayList<>();
        for (T el: list) {
            if(predicate.test(el)) {
                result.add(el);
            }
        }
       return result;
    }
    // end::filterMethod[]

    // PART 1 - ADULT

    // tag::adult[]
    // TODO Compléter la fonction
    // TODO AGE >=18
    Predicate<Person> adult = null;
    // end::adult[]

    @Test
    public void test_predicate() throws Exception {

        List<Person> personList = Data.buildPersonList();

        // TODO invoquer la méthode filter pour que le test soit passant
        List<Person> result = null;

        assertThat(result,  hasSize(4));

    }

    // PART 2 - ADULT AND LASTNAME=France AND FIRSTNAME=Armor

    // tag::predicateand[]
    // TODO compléter la fonction
    // TODO le prédicat vérifie que le nom est "France"
    Predicate<Person> lastnameIsFrance = p -> p.getLastname().equals("France");


    // TODO compléter la fonction
    // TODO le prédicat vérifie que le prénom est "Armor"
    Predicate<Person> firstnameIsArmor = p -> p.getFirstname().equals("Armor");
    // end::predicateand[]

    @Test
    public void test_predicate_and() throws Exception {

        List<Person> personList = Data.buildPersonList();

        // TODO invoquer la méthode filter pour que le test soit passant
        // TODO chaîner les prédicats adult, lastnameIsFrance et firstnameIsArmor avec la méthode and
        List<Person> result = null;

        assertThat(result,  hasSize(1));
        assertThat(result.get(0), hasProperty("firstname", is("Armor")));
        assertThat(result.get(0), hasProperty("lastname", is("France")));
        assertThat(result.get(0), hasProperty("age", is(25)));

    }
}
