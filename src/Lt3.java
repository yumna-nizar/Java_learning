import java.util.Scanner;

public class Lt3 {
    public static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter firsst number");
        int a=sc.nextInt();
        System.out.println("enter second number");
        int b=sc.nextInt();
        System.out.println("before swapping a= "+a+" b= "+b);
//        int c=a^b;
//        c=~c;
//        a=~(a^c);
//        b=~(b^c);(logic found myself)
        a=a^b;
        b=a^b;
        a=a^b;
        System.out.println("after  swapping a= "+a+" b= "+b);




    }
}
