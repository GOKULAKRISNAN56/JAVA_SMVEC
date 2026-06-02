class User  {
    String name;
    String phone;
    String location;
    User(String name,String phone,String location)
    {
        this.name=name;
        this.phone=phone;
        this.location=location;

    }
    public void basicInfo()
    {
        System.out.println("Name: "+name+" Phone: "+phone+" Location: "+location);
    }  
}
class FoodUser extends User
{
    String favFood;
    FoodUser(String name,String phone,String location,String favfood)
    {
        super(name,phone,location);
        this.favFood=favfood;
    }
    public void userDetails()
    {
        basicInfo();
        System.out.println("Favorite Food: "+favFood);
    }

}
// task
class TravelUser extends User 
{
    String favBike;
    TravelUser(String name,String phone,String location,String favBike)
    {
        super(name, phone, location);
        this.favBike=favBike;
    }
    public void userDetails1()
    {
        basicInfo();
        System.out.println("Favorite Bike Travell: "+favBike);
    }

    
}
public class Inherit {
    public static void main(String[] args) {
        FoodUser u1=new FoodUser("Foodie", "9344664856", "Chennai", "Briyani");
        u1.userDetails();
        TravelUser t1=new TravelUser("Swiggy", "9344664856", "Chennai", "R15");
        t1.userDetails1();
    }
}
