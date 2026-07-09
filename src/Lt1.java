import java.util.Scanner;

public class Lt1 {
    public static void main(String[] args)
    {
        System.out.println("enter the number:");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();

        if((a|1)==a)
        {
            System.out.println("this is an odd onumber");
        }
        else {
            System.out.println("this is a even number");
        }

    }
}
