package ru.job4j.tracker;

import org.junit.Test;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class TrackerTest {
    @Test
    public void whenAddNewItemThenTrackerHasSameItem() {
        Tracker tracker = new Tracker();
        Item item = new Item("test1");
        tracker.add(item);
        Item result = tracker.findById(item.getId());
        assertThat(result.getName(), is(item.getName()));
    }

    @Test
    public void findAll() {
        Tracker tracker = new Tracker();

        Item item0 = new Item("test1");
        tracker.add(item0);

        Item item1 = new Item("test2");
        tracker.add(item1);

        Item[] expect = new Item[] {item0, item1};

        Item[] result = tracker.findAll();
        assertThat(result, is(expect));
    }

    @Test
    public void findByName() {
        Tracker tracker = new Tracker();

        Item item0 = new Item("test1");
        tracker.add(item0);

        Item item1 = new Item("test2");
        tracker.add(item1);

        Item[] expect = new Item[] {item1};

        Item[] result = tracker.findByName("test2");
        assertThat(result, is(expect));
    }

    @Test
    public void whenReplace() {
        Tracker tracker = new Tracker();
        Item bug = new Item("Bug");
        tracker.add(bug);
        String id = bug.getId();
        Item bugWithDesc = new Item("Bug with description");
        tracker.replace(id, bugWithDesc);
        assertThat(tracker.findById(id).getName(), is("Bug with description"));
    }
}
