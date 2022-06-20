package java8.ex01;

import java.util.List;
import java.util.stream.Collectors;

import org.junit.Test;

import java8.data.Data;
import java8.data.Person;


/**
 * Exercice 01 - Méthode par défaut
 */
public class Method_01_Test {

    // tag::IDao[]
    interface IDao {
        List<Person> findAll();

        public default int sumAge(List<Person> lp) {
        	int sumAges = lp.stream().map(p -> p.getAge()).reduce((a1,a2) -> a1 + a2).get();
        	return sumAges;
        }
    }
    // end::IDao[]

    class DaoA implements IDao {

        List<Person> people = Data.buildPersonList(20);

        @Override
        public List<Person> findAll() {
            return people;
        }
    }

    class DaoB implements IDao {

        List<Person> people = Data.buildPersonList(100);

        @Override
        public List<Person> findAll() {
            return people;
        }
    }

    @Test
    public void test_daoA_sumAge() throws Exception {

        DaoA daoA = new DaoA();

        // TODO invoquer la méthode sumAge pour que le test soit passant
        int result = daoA.sumAge(daoA.findAll());

        assert result == 210;
    }

    @Test
    public void test_daoB_sumAge() throws Exception {

        DaoB daoB = new DaoB();

        // TODO invoquer la méthode sumAge pour que le test soit passant
        int result = daoB.sumAge(daoB.findAll());;

        assert result == 5050;

    }
}
