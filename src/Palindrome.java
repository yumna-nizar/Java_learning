import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args)
    {
    Scanner sc=new Scanner(System.in);
        System.out.println("enter the number to check if it is palindrome or not:");
        int num=sc.nextInt();
        int temp=num;
        int dig,rev=0;
        for(temp=num;temp>0;temp=temp/10)
        {

            dig=temp%10;
            rev=(rev*10)+dig;
        }
        if(rev==num)
        {
            System.out.println("palindrome number");
        }
        else {
            System.out.println("not palindrome");
        }
    }
}
