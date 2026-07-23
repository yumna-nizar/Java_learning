import java.sql.SQLOutput;
import java.util.Scanner;

public class SwitchExcercise {
    static String abc(int marks)
    {
         switch(marks)
        {
            default:
                System.out.println("hello");
                return "invalid marks";
            case 91,92,93,94,95,96,97,98,99,100: return "Outstanding";
            case 81,82,83,84,85,86,87,88,89,90:return "Excellent";
            case 71,72,73,74,75,76,77,78,79,80: return "Good";
            case 61,62,63,64,65,66,67,68,69,70: return "Need Imporvement";



        }
    }
    public static void main(String[] args)
    {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the marks:");
        int marks=sc.nextInt();



    }
}
