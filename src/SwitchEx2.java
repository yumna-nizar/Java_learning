import java.util.Scanner;

public class SwitchEx2 {
    static enum DayOfWeek {MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY,SUNDAY};
    static String getDayType(DayOfWeek day){
       return switch(day)
        {
            case SATURDAY,SUNDAY-> "weekend";

            case TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,MONDAY ->"weekday";

        };
    }
    static char gradecalculator(int score)
    {

        switch(score/10)
        {
            case 10,9:return 'A';
            case 8:return 'B';
            case 7:return 'C';
            case 6:return 'D';
            default:return 'F';
        }
    }
    public static void main(String args[])
    {
        String daytype=getDayType(DayOfWeek.TUESDAY);
        System.out.println(daytype);
        Scanner sc=new Scanner(System.in);
        int score=sc.nextInt();
        char G=gradecalculator(score);
        System.out.println("grade is "+G);



    }
}

