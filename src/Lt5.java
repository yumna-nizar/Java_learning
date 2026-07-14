import java.util.Scanner;

public class Lt5 {

    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int temp=sc.nextInt();
        int fact=temp;
        for( int i=fact-1;i>=2;i--)
        {
            fact=fact*i;
        }
        System.out.println("factorial of "+temp+" = "+fact);
    }
}
