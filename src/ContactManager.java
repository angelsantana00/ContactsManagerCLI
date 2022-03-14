
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import static java.nio.file.Files.readAllLines;

public class ContactManager {

    public static void displayMenu() throws IOException {
        System.out.println("1. View contacts.");
        System.out.println("2. Add a new contact.");
        System.out.println("3. Search a contact by name.");
        System.out.println("4. Delete an existing contact.");
        System.out.println("5. Exit.");
        System.out.print("Enter an option [ 1 - 5 ]:");
        userOptions();
    }


    public static int userInput() {
        Scanner readInput = new Scanner(System.in);
        int userInput = readInput.nextInt();
        if (userInput >= 1 && userInput <= 5) {
            return userInput;
        } else {
            System.out.println("Please Choose a Valid Number.");
            return userInput();
        }
    }

    public static void createFile(String contact) throws IOException {
        Files.write(
                Paths.get("data", "info.txt"),
                List.of(contact),
                StandardOpenOption.APPEND
        );

    }

    public static String retrieveNewContact() {
        Scanner readInput = new Scanner(System.in);
        System.out.print("Enter First name: ");
        String firstName = readInput.next();
        System.out.print("Enter Last name: ");
        String lastName = readInput.next();
        System.out.print("Enter Phone Number: ");
        long phoneNumber = readInput.nextLong();
        return firstName + " " + lastName + " || " + phoneNumber;

    }

    public static void getContacts() throws IOException {
        Path contactsPath = Paths.get("data", "info.txt");
        List<String> contactList = Files.readAllLines(contactsPath);

        for (int i = 0; i < contactList.size(); i += 1) {
            System.out.println((i + 1) + ": " + contactList.get(i));
        }
    }

    // <================ SEARCH ================> //
    public static void search(String query) throws IOException {
        Path contactsPath = Paths.get("data", "info.txt");
        List<String> contactList = Files.readAllLines(contactsPath);

        for (String element : contactList) {
            if(element.contains(query)){
                System.out.println(element);
            }
        }
    }


    public static String getSearchInput(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter First Name: ");
        return in.nextLine();
    }


    // <================ DELETE INC================> //
    public static void deleteContact(String query) throws IOException {
        Path contactsPath = Paths.get("data", "info.txt");
        List<String> contactList = Files.readAllLines(contactsPath);

        for (String element : contactList) {
            if(element.contains(query)){
                contactList.remove(element);

                System.out.println(query + " " + "Has been deleted");
            }
        }

    }

    public static void userOptions() throws IOException {
        int choice;
        do {
            choice = userInput();
            switch (choice) {
                case 1:getContacts();
                    System.out.println("Viewing all Contacts");
                    continue;
                case 2:
                    createFile(retrieveNewContact());
                    displayMenu();
                    continue;
                case 3:search(getSearchInput());
                    System.out.println("Search by Name");
                    displayMenu();
                    continue;
                case 4:deleteContact(getSearchInput());
                    System.out.println("Delete");
                    displayMenu();

            }

        } while (choice != 5);
        System.out.println("Goodbye");
    }


    public static void main(String[] args) throws IOException {
        displayMenu();
    }
}