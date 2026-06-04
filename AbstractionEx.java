abstract class Vechicle{
    abstract void start();
    public void stop()
    {
        System.out.println("Stopped");
    }
}
class Car extends Vechicle
{
    void start()
        {
            System.out.println("Car started");
        }
    
}

public class AbstractionEx {
 public static void main(String[] args) {
    Vechicle v=new Car();
    v.start();
    v.stop();
    
 }   
}
