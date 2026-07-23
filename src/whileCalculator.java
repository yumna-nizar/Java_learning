import java.util.Scanner;

public class whileCalculator {
   public static void main() {
       int num1,num2,choice,calcu;
       Scanner sc=new Scanner(System.in);
       do {                                   //While loop for showing the menu
           System.out.println("********* Calculator *********");
           System.out.println("1.Addition");
           System.out.println("2.Subtraction");
           System.out.println("3.Multiplication");
           System.out.println("4.Division");
           System.out.println("5.Modulus");
           System.out.println("6.Exit From calculator");
           System.out.println("\n\nEnter your choice:");
           choice=sc.nextInt();
           if(choice<1 || choice >6)
           {
               System.out.println("invalid choice.\n Enter a valid choice");
           }
           else {
               switch(choice)
               {
                   case 1->{
                       System.out.println("enter the first num:");
                       num1=sc.nextInt();
                       System.out.println("enter the second num:");
                       num2=sc.nextInt();
                       calcu=num1+num2;
                       System.out.println(calcu);
                   }

                   case 2->
                   {
                       System.out.println("enter the first num:");
                       num1=sc.nextInt();
                       System.out.println("enter the second num:");
                       num2=sc.nextInt();
                       calcu=num1-num2;
                       System.out.println(calcu);
                   }

                   case 3->
                           {
                       System.out.println("enter the first num:");
                       num1=sc.nextInt();
                       System.out.println("enter the second num:");
                       num2=sc.nextInt();
                       calcu=num1*num2;
                       System.out.println(calcu);
                           }


                   case 4->
                           {
                       System.out.println("enter the first num:");
                       num1=sc.nextInt();
                       System.out.println("enter the second num:");
                       num2=sc.nextInt();
                       calcu=num1/num2;
                       System.out.println(calcu);
                           }

                   case 5->{

                       System.out.println("enter the first num:");
                       num1=sc.nextInt();
                       System.out.println("enter the second num:");
                       num2=sc.nextInt();
                       calcu=num1%num2;
                       System.out.println(calcu);
                   }



               }
           }

           }while(choice!=6);
       System.out.println("Thank You");

    }
}
