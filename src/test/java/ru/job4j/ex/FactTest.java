package ru.job4j.ex;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class FactTest {

    @Test(expected = IllegalArgumentException.class)
    public void FactException() {
        Fact f = new Fact();
        f.calc(-1);
    }
}
