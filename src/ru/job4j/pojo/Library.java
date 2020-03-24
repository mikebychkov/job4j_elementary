package ru.job4j.pojo;

public class Library {

    public static void main(String[] args) {
        Book b1 = new Book("Gerbert Wells", 687);
        Book b2 = new Book("Dictionary", 977);
        Book b3 = new Book("Java for Dummies", 455);
        Book b4 = new Book("Clean Code", 1235);

        Book[] lib = new Book[] {b1, b2, b3, b4};

        for (int x = 0; x < lib.length; x++) {
            System.out.println(lib[x].getName() + " , pages: " + lib[x].getPagenum());
        }

        System.out.println();
        System.out.println("\nSwapping 1 and 4 books:");
        Book temp = lib[0];
        lib[0] = lib[3];
        lib[3] = temp;

        for (int x = 0; x < lib.length; x++) {
            System.out.println(lib[x].getName() + " , pages: " + lib[x].getPagenum());
        }

        System.out.println("\nPresenting only 'Clean code' book:");
        for (int x = 0; x < lib.length; x++) {
            if (lib[x].getName() == "Clean Code") {
                System.out.println(lib[x].getName() + " , pages: " + lib[x].getPagenum());
            }
        }
    }
}
