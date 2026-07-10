import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class CoffeeOrderingSystem {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int bill=0;
        System.out.println("*****************\nWelcome to the Coffe SHop\n*****************");
        System.out.println("Choose your coffee:");
        System.out.println("1)Espresso  - $200\n1)Cappuccino  - $250\n1)Latte  - $300");
        System.out.println("enter your choice:");
        int choice=sc.nextInt();
        if(choice!=1 && choice!=2 && choice!=3 )
        {
            System.out.println("Invalid choice");
        }
        else {
            if(choice==1)
            {
                bill=200;
            }
            else if (choice==2)
            {
                bill=250;
            }
            else
            {
                bill=300;
            }
            System.out.println("Add whipped cream for ₹30? (yes=1 / no=0)");
            choice=sc.nextInt();
            if(choice==1)
            {
                bill=bill+30;
            }
            System.out.println("Add a flavor shot? (Vanilla for ₹20 or Hazelnut for ₹25) (yes=1 / no=0)");
            boolean flavourchoice;
            choice=sc.nextInt();
            if(choice==1)
            {
                System.out.println("Which one? (Enter 1 for Vanilla & 2 for Hazelnut)");
                choice=sc.nextInt();
                if(choice==1)
                {
                    bill=bill+20;

                }
                else {
                    bill=bill+25;
                }
            }
            System.out.println("Total bill= "+bill);
        }







    }
}
