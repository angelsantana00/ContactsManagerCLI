import java.util.Scanner;

public class Contacts {

    //<============ Displays CLI =============>//
    public static void userMenu() {
        System.out.println("1. View Contacts \n" +
                "2. Add a New Contact\n" +
                "3. Search For Contact\n" +
                "4. Delete Existing Contact\n" +
                "5. Exit\n" +
                "Please Enter an Option | 1 - 5 |");

        userOptions();
    }

    //<============ User Input =============>//
    public static int captureUserInput() {
        Scanner in = new Scanner(System.in);

        int usersChoice = in.nextInt();

        if (usersChoice >= 1 && usersChoice <= 5) {
            return usersChoice;
        } else {
            System.out.println("Please Pick Another Number");
            return captureUserInput();
        }
    }

    //<============ userOptions =============>//
    public static void userOptions() {
        int choice;
        do {
            choice = captureUserInput();
            if (choice == 1) {
                System.out.println(" 1. Viewing all Contacts ");

            } else if (choice == 2) {
                System.out.println(" 2. Add a Contact ");

            } else if (choice == 3) {
                System.out.println(" 3. Search for Contact ");

            } else if (choice == 4) {
                System.out.println(" 4. Delete a Contact ");
            }
        } while (choice != 5);
        System.out.println(" Exiting... ");
    }

    public static void viewContacts() {

    }

    public static void addContacts() {
        System.out.println("Name Contact: ");


    }

    public static void searchContacts() {

    }

    public static void deleteContacts() {

    }




    public static void main(String[] args) {
        userMenu();

    }

}

//TODO: Step 1 : Create the menu / options✅
// TODO: Step 2: Capture user input✅
// TODO: Step 3: Lets display something based on the option they choose
// so we can already capture their input.... if a user picks 1 display "this"; just try writing the method
// think how can we do that

//  no ...what happens when u run this. it works BRB aight
