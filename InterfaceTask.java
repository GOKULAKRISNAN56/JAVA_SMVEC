interface payment 
{
    void makePayment();
    
}
class Phonepe implements payment
{
    public void makePayment()
    {
        System.out.println("send money through phonepay");
    }
}
class Googlepay implements payment
{
    public void makePayment()
    {
        System.out.println("send money through Googlepay");
    }
}
class Paytm implements payment
{
    public void makePayment()
    {
        System.out.println("send money through Paytm");
    }
}
public class InterfaceTask {
    public static void main(String[] args) {
        Phonepe p=new Phonepe();
        p.makePayment();
        Googlepay g=new Googlepay();
        g.makePayment();
        Paytm t=new Paytm();
        t.makePayment();
    }
}
