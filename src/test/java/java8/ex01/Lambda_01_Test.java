package java8.ex01;

import java8.data.Data;
import java8.data.Person;

import org.junit.Test;
import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

import java.util.List;

/**
 * Exercice 01 - Filter
 */
public class Lambda_01_Test {

    // tag::PersonPredicate[]
    interface PersonPredicate {
        boolean test(Person p);
    }
    // end::PersonPredicate[]

    // tag::filter[]
    private List<Person> filter(List<Person> persons, PersonPredicate predicate) {
        // TODO implementer la méthode
        return null;
    }
    // end::filter[]


    // tag::test_filter_by_age[]
    @Test
    public void test_filter_by_age() throws Exception {

        List<Person> personList = Data.buildPersonList(100);

        // TODO result ne doit contenir que des personnes adultes (age >= 18)
        List<Person> result = filter(personList, null);

        assertThat(result.size(), is(83));
        assertThat(result, everyItem(hasProperty("age", greaterThan(17))));
    }
    // end::test_filter_by_age[]

    // tag::test_filter_by_firstname[]
    @Test
    public void test_filter_by_firstname() throws Exception {

        List<Person> personList = Data.buildPersonList(100);

        // TODO result ne doit contenir que des personnes dont le prénom est "first_10"
        List<Person> result = filter(personList, null);

        assertThat(result.size(), is(1));
        assertThat(result, everyItem(hasProperty("firstname", is("first_10"))));
    }
    // end::test_filter_by_firstname[]

    // tag::test_filter_by_password[]
    @Test
    public void test_filter_by_password() throws Exception {

        List<Person> personList = Data.buildPersonList(100);

        String passwordSha512Hex = "ee26b0dd4af7e749aa1a8ee3c10ae9923f618980772e473f8819a5d4940e0db27ac185f8a0e1d5f84f88bc887fd67b143732c304cc5fa9ad8e6f57f50028a8ff";

        // TODO result ne doit contenir que les personnes dont l'age est > 49 et dont le hash du mot de passe correspond à la valeur de la variable passwordSha512Hex
        // TODO Pour obtenir le hash d'un mot, utiliser la méthode DigestUtils.sha512Hex(mot)
        List<Person> result = filter(personList, null);

        assertThat(result.size(), is(6));
        assertThat(result, everyItem(hasProperty("password", is("test"))));
    }
    // end::test_filter_by_password[]
}
