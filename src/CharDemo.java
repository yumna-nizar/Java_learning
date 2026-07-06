public class CharDemo {
    char ch1='A';
    char ch2='\u0041';
    char ch3=65;
    char maxval=Character.MAX_VALUE;
    char minval=Character.MIN_VALUE;
    int a=(int)maxval;
    int b=(int)minval;
    void display()
    {
        System.out.println(ch1);//A
        System.out.println(ch2);//A
        System.out.println(ch3); //A
        System.out.println(minval);//￿
        System.out.println(maxval); //￿
        System.out.println(a); //65535
        System.out.println(b); //0
    }
    public static void main(String[] args)
    {
        CharDemo obj=new CharDemo();
        obj.display();
    }
}
