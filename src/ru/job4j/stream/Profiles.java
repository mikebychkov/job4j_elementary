package ru.job4j.stream;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Profiles {

    public List<Address> collect(List<Profile> profiles) {
        return profiles.stream().map(pr -> pr.getAddress()).collect(Collectors.toList());
    }

    public List<Address> collectDistinctByCity(List<Profile> profiles) {
        List<Address> rsl = collect(profiles);
        Comparator<Address> compByCity = (a1, a2) -> a1.getCity().compareTo(a2.getCity());
        rsl.sort(compByCity);
        return rsl.stream().distinct().collect(Collectors.toList());
    }
}
