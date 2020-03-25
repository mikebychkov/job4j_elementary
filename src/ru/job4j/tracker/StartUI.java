package ru.job4j.tracker;

import java.util.Scanner;

public class StartUI {

    public void init(Scanner scanner, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            int select = Integer.valueOf(scanner.nextLine());
            if (select == 0) {

                System.out.println("==== Create a new Item ====");
                System.out.print("Enter name: ");

                String name = scanner.nextLine();

                Item item = new Item(name);
                tracker.add(item);

            } else if (select == 1) {

                System.out.println("==== Show All Items ====");
                Item[] items = tracker.findAll();
                for (int i = 0; i < items.length; i++) {
                    System.out.println(items[i].getName() + " (" + items[i].getId() + ")");
                }

            } else if (select == 2) {

                System.out.println("==== Edit an Item ====");
                System.out.println("Enter ID: ");
                String id = scanner.nextLine();
                Item res = tracker.findById(id);
                if (res != null) {
                    System.out.println("Enter new Name: ");
                    res.setName(scanner.nextLine());
                } else {
                    System.out.println("Wrong ID!");
                }

            } else if (select == 3) {

                System.out.println("==== Delete an Item ====");
                System.out.println("Enter ID: ");
                String id = scanner.nextLine();
                if (tracker.delete(id)) {
                    System.out.println("Success!");
                } else {
                    System.out.println("Wrong ID!");
                }

            } else if (select == 4) {

                System.out.println("==== Find Item by ID ====");
                System.out.println("Enter ID: ");
                String id = scanner.nextLine();
                Item res = tracker.findById(id);
                if (res != null) {
                    System.out.print(res.getName() + " (" + res.getId() + ")");
                } else {
                    System.out.println("Wrong ID!");
                }

            } else if (select == 5) {

                System.out.println("==== Find Item by Name ====");
                System.out.println("Enter Name: ");
                String name = scanner.nextLine();
                Item[] items = tracker.findByName(name);
                for (int i = 0; i < items.length; i++) {
                    System.out.println(items[i].getName() + " (" + items[i].getId() + ")");
                }

            } else if (select == 6) {
                run = false;
            }
        }
    }

    private void showMenu() {
        System.out.println("======================");
        System.out.println("Menu:");
        System.out.println("0. Add new Item");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by Id");
        System.out.println("5. Find items by name");
        System.out.println("6. Exit Program");
        System.out.println("Select:");
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);
    }
}