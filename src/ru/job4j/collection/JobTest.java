package ru.job4j.collection;

import org.junit.Test;

import java.util.*;

import static org.hamcrest.Matchers.lessThan;
import static org.hamcrest.Matchers.greaterThan;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;

public class JobTest {
    @Test
    public void whenCompatorByNameAndPrority() {
        Comparator<Job> cmpNamePriority = new JobDescByName().thenComparing(new JobDescByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void byNameAsc() {
        Job j1 = new Job("Job #1", 2);
        Job j2 = new Job("A super job", 1);

        Comparator<Job> cmpPriorityName = new JobAscByName();
        int rsl = cmpPriorityName.compare(j1, j2);
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void byPriorityDesc() {
        Job j1 = new Job("Job #1", 2);
        Job j2 = new Job("A super job", 1);

        Comparator<Job> cmpPriorityName = new JobAscByPriority();
        int rsl = cmpPriorityName.compare(j1, j2);
        assertThat(rsl, greaterThan(0));
    }

    @Test
    public void combinedSort() {
        Job j1 = new Job("Job #1", 2);
        Job j2 = new Job("A super job", 1);

        Comparator<Job> cmpPriorityName = new JobAscByPriority().thenComparing(new JobDescByName());
        int rsl = cmpPriorityName.compare(j1, j2);
        assertThat(rsl, greaterThan(0));
    }
}