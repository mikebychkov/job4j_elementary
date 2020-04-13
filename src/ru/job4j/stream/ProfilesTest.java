package ru.job4j.stream;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;

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
}
