import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class RelationalOperatorDemo {
    public static void main(String[] args) {
//        String a="yumna";
//        String b="yumna";
//        System.out.println(a==b);
//        String c=new String("yusra");
//        String d=new String("yusra");
//        System.out.println(c==d);
//        int f=65;
//        int e=5+60c;
//         System.out.println(f==e);
//        int year = 1900;
//        System.out.println(((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) ? "this is a leap year" : "this is not");
        Scanner sc=new Scanner(System.in);
//          int a=sc.nextInt();
//          int b=sc.nextInt();
//          int c=sc.nextInt();
//          int biggest=a;
//
//          if(b>a)
//          {
//              biggest=b;
//
//          }
//          if(c>biggest)
//          {
//              biggest=c;
//          }
//        System.out.println("the biggest number among "+a+" "+b+" "+c+ " is "+biggest);
//        float height=sc.nextFloat();
//        float weight=sc.nextFloat();
//        float Bmi=(weight/(height*height));
//        System.out.println("the BMI = "+Bmi);
        int a=5;
        int b=3;
        int c=2;
        boolean result=(a>b)&&(b!=c)||!(a<c+b);
        System.out.println(result);


    }
}

