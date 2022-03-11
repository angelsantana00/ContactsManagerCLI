import java.util.Scanner;

public class Contacts {

                        //<============ Displays CLI =============>//
public static void userMenu(){
    System.out.println("1. View Contacts \n" +
            "2. Add a New Contact\n" +
            "3. Search For Contact\n" +
            "4. Delete Existing Contact\n" +
            "5. Exit\n" +
            "Please Enter an Option | 1 - 5 |");

    int userChoice =

}
                        //<============ User Input =============>//
public static int captureUserInput(){
    Scanner in = new Scanner(System.in);

    int usersChoice = in.nextInt();

    if(usersChoice >=1 && usersChoice <=5){
        return usersChoice;
    }else{
        System.out.println("Please Pick Another Number");
        return captureUserInput();
    }


//
}

    public static void main(String[] args) {

        userMenu();
        captureUserInput();


    }

}

//TODO: Step 1 : Create the menu / options✅
// TODO: Step 2: Capture user input✅
// TODO: Step 3: Lets display something based on the option they choose

// 5 minutes left? tf
// just start another session after.aight im stuck