public class CharDemo {
    char ch1='A';
    char ch2='\u0041';
    char ch3=65;
    void display()
    {
        System.out.println(ch1);
        System.out.println(ch2);
        System.out.println(ch3);
    }
    public static void main(String[] args)
    {
        CharDemo obj=new CharDemo();
        obj.display();
    }
}
