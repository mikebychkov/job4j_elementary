package ru.job4j.tracker;

//import java.util.Scanner;

public class StartUI {

    public void init(Input scanner, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            //int select = Integer.valueOf(scanner.nextLine());
            int select = scanner.askInt("Select:");
            if (select == 0) {
                System.out.println("==== Create a new Item ====");
                //System.out.print("Enter name: ");
                //String name = scanner.nextLine();
                String name = scanner.askStr("Enter name:");
                Item item = new Item(name);
                tracker.add(item);
            } else if (select == 1) {
                System.out.println("==== Show All Items ====");
                Item[] items = tracker.findAll();
                for (int i = 0; i < items.length; i++) {
                    System.out.println(items[i]);
                }
            } else if (select == 2) {
                System.out.println("==== Edit an Item ====");
                //System.out.println("Enter ID: ");
                //String id = scanner.nextLine();
                String id = scanner.askStr("Enter ID:");
                Item res = tracker.findById(id);
                if (res != null) {
                    //System.out.println("Enter new Name: ");
                    //res.setName(scanner.nextLine());
                    res.setName(
                        scanner.askStr("Enter name:")
                    );
                    System.out.println("Successfully edited!");
                } else {
                    System.out.println("Wrong ID!");
                }
            } else if (select == 3) {
                System.out.println("==== Delete an Item ====");
                //System.out.println("Enter ID: ");
                //String id = scanner.nextLine();
                String id = scanner.askStr("Enter ID:");
                if (tracker.delete(id)) {
                    System.out.println("Successfully deleted!");
                } else {
                    System.out.println("Wrong ID!");
                }
            } else if (select == 4) {
                System.out.println("==== Find Item by ID ====");
                //System.out.println("Enter ID: ");
                //String id = scanner.nextLine();
                String id = scanner.askStr("Enter ID:");
                Item res = tracker.findById(id);
                if (res != null) {
                    System.out.print(res);
                } else {
                    System.out.println("Wrong ID!");
                }
            } else if (select == 5) {
                System.out.println("==== Find Item by Name ====");
                //System.out.println("Enter Name: ");
                //String name = scanner.nextLine();
                String name = scanner.askStr("Enter name:");
                Item[] items = tracker.findByName(name);
                for (int i = 0; i < items.length; i++) {
                    System.out.println(items[i]);
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
        //System.out.println("Select:");
    }

    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        Input scanner = new ConsoleInput();
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);
    }
}
