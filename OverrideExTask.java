class Vechicle
{
    void Start()
    {
        System.out.println("Starting!!!....");
    }
}
class car extends Vechicle
    {
        @Override
        void Start()
        {
            System.out.println("car Starting!!!....");
        }
        
    }
    class Bike extends Vechicle
    {
        @Override
        void Start()
        {
            System.out.println("Bike Starting!!!....");
        }
        
    }
    class Bus extends Vechicle
    {
        @Override
        void Start()
        {
            System.out.println("Bus Starting!!!....");
        }
        
    }

public class OverrideExTask {
    public static void main(String[] args) {
        Vechicle v1=new Vechicle();
        v1.Start();
        v1=new car();
        v1.Start();
        v1=new Bike();
        v1.Start();
        v1=new Bus();
        v1.Start();
    }
}
