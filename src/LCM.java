import java.util.Scanner;

public class LCM {
    public static void main(String[] args)
    {
        int i=1,j=1;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter two numbers:");
        int num1= sc.nextInt();
        int num2=sc.nextInt();
        if(num2>num1)
        { //swapping num2 with num1
            num1=num1+num2;
            num2=num1-num2;
            num1=num1-num2;

        }

        while(i>0)
        {
            j=num1*i; //j=multiple of num1

            if(j%num2==0) //checking if j(multiple of num1 ) is divisible by num2
            {
                System.out.println("Lcm is "+j);  //if it is divisible then lcm is j
                break;
            }

            i++;
        }
    }

}
//optimised approach for finding lcm is  lcm=(num1*num2)/gcd(num1,num2)
