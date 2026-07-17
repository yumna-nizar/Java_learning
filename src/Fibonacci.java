import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args)
    {
        System.out.println("enter the count of fibonacci number you want:");
      Scanner sc=new Scanner(System.in);
      int num=sc.nextInt();
      int sum=1;
      int temp=1;
      int temp2=0;
      for(int i=0;i<=num;i++)
      {
          System.out.println(sum);
        sum=temp2+temp;
        temp2=temp;
        temp=sum;

      }

    }
}
