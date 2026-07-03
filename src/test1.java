public class test1 {

    int Octalnum=037;
    int Hexamnum=0xAF;
    int Binarynum=0B1010;

     void display()
    {
        System.out.println("octal number is = "+Octalnum);
        System.out.println("hexadecimal number is = "+Hexamnum);
        System.out.println("binary number is = "+Binarynum);

    }
    public static void main(String[] args)
    {
        test1 Obj=new test1();
        Obj.display();

    }
}
