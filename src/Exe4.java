import java.util.Scanner;

public class Exe4 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter 3 values:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int largest;
        int seclargest;
        if((a>b && a<c) || (a>c && a<b))
        {
            seclargest=a;
        }
        else if((b>a && b<c) || (b>c && b<a))
        {
            seclargest=b;
        }
        else {
            seclargest=c;
        }
        System.out.println("second largest number is "+seclargest);





    }

}
