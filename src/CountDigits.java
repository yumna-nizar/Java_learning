import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args)
    {
        System.out.println("enter a number to count the digits:");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int count=0;
        for(int i=num;i>0;i=i/10)
        {
            count++;
        }
        System.out.println(count);
    }
}
