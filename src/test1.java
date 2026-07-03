public class test1 {

    int rollno=2147483647;

     void display()
    {
        rollno=2147483647+1;//overflow condition
        System.out.println(rollno);
    }
    public static void main(String[] args)
    {
        test1 Obj=new test1();
        Obj.display();

    }
}
