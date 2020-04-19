package ru.job4j.array;

public class ArrayDefinition {

    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        //
        String[] names = new String[4];
        names[0] = "Mike";
        names[1] = "Phill";
        names[2] = "Nicole";
        names[3] = "Stasy";
        for (int x = 0; x < names.length; x++) {
            System.out.println(names[x]);
        }
    }
}
