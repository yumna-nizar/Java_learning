import java.util.Scanner;

public class Exe5 {
     public  static void main(String[] args)
     {
         Scanner sc=new Scanner(System.in);
         System.out.println("enter the marks");
         int marks=sc.nextInt();
         if(marks>100)
         {
             System.out.println("invalid marks");
         }
         else {


         char Grade=switch(marks/10)
         {
             case 10,9:yield 'A';
             case 8:yield 'B';
             case 7:yield 'C';
             case 6:yield 'D';
             default:yield 'F';

         };
         System.out.println("grade is  "+Grade);
         }
     }
}
