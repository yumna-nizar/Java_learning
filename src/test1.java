public class test1 {

    int MAXValue=2147483647;
    int MINValue=-2147483648;

     void display()
    {
        MAXValue=MAXValue+1;//overflow condition
        MINValue=MINValue-1;
        System.out.println(MAXValue);
        System.out.println(MINValue);
    }
    public static void main(String[] args)
    {
        test1 Obj=new test1();
        Obj.display();

    }
}
