package ru.job4j.stream;

import org.junit.Test;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class ProfilesTest {

    @Test
    public void test() {
        Address adr = new Address("London", "Baker street", 5, 11);
        Profile pr = new Profile(adr);
        Profiles prs = new Profiles();
        List<Address> rsl = prs.collect(Arrays.asList(pr));
        List<Address> exp = Arrays.asList(adr);
        assertThat(rsl, is(exp));
    }

    @Test
    public void test1() {
        Address adr1 = new Address("London", "Baker street", 5, 11);
        Address adr2 = new Address("Moskow","Lenina",11,5);
        Address adr3 = new Address("Aleutsk","Ivanova",33,2);

        Profile pr1 = new Profile(adr1);
        Profile pr2 = new Profile(adr2);
        Profile pr3 = new Profile(adr1);
        Profile pr4 = new Profile(adr3);

        Profiles prs = new Profiles();

        List<Address> rsl = prs.collect(Arrays.asList(pr1, pr2, pr3, pr4));
        Comparator<Address> compByCity = (a1, a2) -> a1.getCity().compareTo(a2.getCity());
        rsl.sort(compByCity);
        rsl = rsl.stream().distinct().collect(Collectors.toList());
        List<Address> exp = Arrays.asList(adr3, adr1, adr2);

        assertThat(rsl, is(exp));
    }
}
