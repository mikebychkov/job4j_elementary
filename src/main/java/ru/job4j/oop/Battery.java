package ru.job4j.oop;

public class Battery {

    private int load;

    public Battery(int load) {
        this.load = load;
    }

    public void exchange(Battery another) {
        another.load += this.load;
        this.load = 0;
    }

    public int checkLoad() {
        return this.load;
    }

    public static void main(String[] args) {
        Battery b1 = new Battery(30);
        Battery b2 = new Battery(40);
        System.out.println("b1: " + b1.checkLoad());
        System.out.println("b2: " + b2.checkLoad());
        System.out.println("Exchanging...");
        b1.exchange(b2);
        System.out.println("b1: " + b1.checkLoad());
        System.out.println("b2: " + b2.checkLoad());
    }
}
