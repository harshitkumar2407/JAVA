class Mobile {
    String brand;
    int price;
    static String name;

    static 
    {
        name = "Phone";
        System.out.println("in static block");
    }
    public Mobile()
    {
        brand = "";
        price = 200;
        // name = "Phone";
    }
    
    public void show()
    {
        System.out.println(brand + " : " + price + " : " + name);
    }
    public static void show1(Mobile obj)
    {
        System.out.println("By passing the object"+obj.brand + " : " + obj.price + " : " + name);
    }
    
    public static void show1()
    {
        System.out.println("in Static Mehod");
    }
    

}
public class StaticMethod {
    
    public static void main(String[] args) throws ClassNotFoundException {

        // Mobile obj1 = new Mobile();
        // obj1.brand = "Apple";
        // obj1.price = 125_000;

        // obj1.show();
        
        // Mobile obj2 = new Mobile();
        // obj2.brand = "Sumsang";
        // obj2.price = 75_000;

        // obj2.show();

        // Mobile.name = "Smartphone";
        // obj1.show();

        // Mobile.show1();
        // Mobile.show1(obj1);

        Class.forName("Mobile");

    }
}
