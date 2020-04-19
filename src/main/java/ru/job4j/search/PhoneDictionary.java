package ru.job4j.search;

import java.util.ArrayList;
import java.util.function.Predicate;

public class PhoneDictionary {
    private ArrayList<Person> persons = new ArrayList<Person>();

    public void add(Person person) {
        this.persons.add(person);
    }

    /*
    public ArrayList<Person> find(String key) {
        ArrayList<Person> result = new ArrayList<>();
        for (Person p : this.persons) {
            if (p.toString().contains(key)) {
                result.add(p);
            }
        }
        return result;
    }
    */
    public ArrayList<Person> find(String key) {
        Predicate<Person> prName = (p) -> p.getName().contains(key);
        Predicate<Person> prSurname = (p) -> p.getSurname().contains(key);
        Predicate<Person> prAddress = (p) -> p.getAddress().contains(key);
        Predicate<Person> prPhone = (p) -> p.getPhone().contains(key);
        Predicate<Person> combine = prName.or(prSurname.or(prAddress.or(prPhone)));
        //ArrayList<Person> result = new ArrayList<>();
        var result = new ArrayList<Person>();
        for (Person person : persons) {
            if (combine.test(person)) {
                result.add(person);
            }
        }
        return result;
    }
}
