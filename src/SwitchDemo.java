import java.util.Scanner;

public class SwitchDemo {
    public static void main(String[] args) {

        int choice;
        // final int a = 1;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number from 1 to 7: ");
        choice = scanner.nextInt();
   //order of complexity of switch statements is O(1)
        switch (choice) {   // selector expression

            case 1:
                System.out.println("Monday.");
                break;

            case 2:
                System.out.println("Tuesday.");
                break;

            case 3:
                System.out.println("Wednesday.");
                break;

            case 4:
                System.out.println("Thursday.");
                break;

            case 5:
                System.out.println("Friday.");
                break;

            case 6:
                System.out.println("Saturday.");
                break;

            case 7:
                System.out.println("Sunday.");
                break;

            default:
                System.out.println("Invalid Day Choice.");
        }



        //order of complexity of if else statement in worst case is O(n)
        //more time than switch statements
        //this code does the same task done with the switch statements given above.
        //this is done with if else statements
//        if (choice == 1) {   // 1/0
//            System.out.println("Monday.");
//        }
//        else if (choice == 2) {
//            System.out.println("Tuesday.");
//        }
//        else if (choice == 3) {
//            System.out.println("Wednesday.");
//        }
//        else if (choice == 4) {
//            System.out.println("Thursday.");
//        }
//        else if (choice == 5) {
//            System.out.println("Friday.");
//        }
//        else if (choice == 6) {
//            System.out.println("Saturday.");
//        }
//        else if (choice == 7) {
//            System.out.println("Sunday.");
//        }
//        else {
//            System.out.println("Invalid Day Choice!");
//        }
    }
}




