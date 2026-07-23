import java.util.Scanner;

public class GCD {
    static void main() {
        System.out.println("enter two numbers to check the greatest common divisor");
        Scanner sc=new Scanner(System.in);
        int num1=sc.nextInt();
        int num2=sc.nextInt();
        int i=1;
        int gcd=0;
//        while(i<num2)
//        {
//           if(num1%i==0 && num2%i==0)
//           {
//               gcd=i;
//           }
//           i++;
//        }
        System.out.println("gcd of "+num1 +" " +num2 +" is "+ gcd);
        System.out.print("gcd of "+num1+" and "+num2+" is ");
        if(num2>num1)
        {  //swapping num1 and num2 ,making num1 greater
            int temp;
            temp=num1;
            num1=num2;
            num2=temp;
        }
        while(num2!=0)
        {                      // eg:48 18
            int temp;
            temp=num2;         // temp=18      next iteration:temp=12        next iter:temp=6
            num2=num1%num2;    //num2=48%18=12                num2=18%12=6            num2=12%6=0
            num1=temp;         //num1=18                      num1=12                 num1=6

        }
        System.out.print(num1);
    }
}
