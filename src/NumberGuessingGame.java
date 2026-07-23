import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    static void main() {
        Scanner sc=new Scanner(System.in);
        Random rd=new Random();

        int choice=0;
        int restart=0;
        do{
            System.out.println("-------------------number guessing game----------------");
            System.out.println("choose the difficulty level:");
            int answer=rd.nextInt(100)+1;
            System.out.println("1 - Hard \n2 - Medium \n3 - Easy");

            int attempt=0;
            do {
                int difficulty=sc.nextInt();
                attempt=switch(difficulty)
                {
                    case 1-> 5;
                    case 2->7;
                    case 3->10;
                    default ->{
                        System.out.println("invalid choice: try again with a valid difficulty level");
                        System.out.println("1 - Hard \n2 - Medium \n3 - Easy");

                        yield -1;
                    }


                };
            }while(attempt<0);



            do {
                System.out.println("you have "+attempt+" no of attempts left");
                System.out.println("input a number ranging from 1-100");
                choice=sc.nextInt();
                if(choice<1 || choice>100)
                {
                    System.out.println("invalid choice try again with valid range 1-100");
                }
                else {
                    if(choice>answer)
                    {
                        System.out.println("Too High");
                        attempt--;
                    }
                    else if(choice<answer)
                    {
                        System.out.println("Too low");
                        attempt--;

                    }
                    else if(choice==answer)
                    {
                        System.out.println("Correct!");
                        break;
                    }


                }
            }while(attempt>0);
            System.out.println("th number is "+answer);
            System.out.println("do you want to play this again? if YES enter 1 if NO enter 0");
            restart=sc.nextInt();
        }while(restart==1);

    }
}
