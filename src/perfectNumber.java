import java.util.Scanner;

public class perfectNumber {
    public static void main() {
        System.out.println("enter the number:");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        int i=1;
        int sum=0;
        while(i<num)
        {
            if(num%i==0)
            {
                sum=sum+i;
            }
            i++;
        }
        if(num==sum) {
            System.out.println(num + " is a perfect number.");
        }
        else {
            System.out.println(num+" is not a perfect number.");
        }

    }
}
