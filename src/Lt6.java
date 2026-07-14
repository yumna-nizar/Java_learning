import java.util.Scanner;

public class Lt6 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        for(int i=10;i>=1;i--)
        {
            int product=num*i;
            System.out.println(num+"*"+i+" = "+product);
        }

    }
}
