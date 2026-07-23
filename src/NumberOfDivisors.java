import java.util.Scanner;

public class NumberOfDivisors {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number:");
        int num=sc.nextInt();
        int i=1,count=0;
        while(i<=num)
        {
            if (num % i == 0) {
                System.out.println(i);
              count++;

            }
            i++;
        }
        System.out.println("count of divisors of this number is "+count);
    }
}
