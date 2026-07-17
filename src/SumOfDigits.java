import java.util.Scanner;

public class SumOfDigits {
    public static void main(String[] args)
    {
        System.out.println("enter the number:");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int sum=0;
        int temp=num;
        for(int i=num;i>0;i=i/10)
        {
            sum=sum+(i%10);

        }
        System.out.println("Sum of digits of number "+num+" is "+sum);
    }

}
