public class Pgrm1 {
    public static void main(String[] args)
    {
     Bank obj1=new Bank("yumna");
     obj1.deposit(1205);
     obj1.show_balance();
     obj1.withdraw(6);
     obj1.show_balance();

    }
}
class Bank
{
    Bank(String name)
    {
        ac_holder_name=name;
    }
    String ac_holder_name;
    int balance;
    int money;
    void withdraw(int money)
    {
        balance=balance-money;
    }
    void show_balance()
    {
        System.out.println(balance);
    }
    void deposit(int money)
    {
        balance=balance+money;
    }

}

