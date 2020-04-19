package ru.job4j.pojo;

import java.util.Date;

public class College {

    public static void main(String[] args) {
        Student vano = new Student();
        vano.setFio("Vano Gevalishvili");
        vano.setGroup("Geologiya");
        vano.setAdmission(new Date());
        System.out.println("Student " + vano.getFio() + " of " + vano.getGroup() +
                " group had " + vano.getAdmission() + " admissed.");
    }
}
