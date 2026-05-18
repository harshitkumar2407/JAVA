class Mobile {
    String brand;
    int price;
    static String name;
    
    public void print()
    {
        System.out.println(brand + " : " + price + " : " + name);
    }
}
public class StaticVariable {
    
    public static void main(String[] args) {
        Mobile obj1 = new Mobile();
        obj1.brand = "Apple";
        obj1.price = 125_000;

        obj1.print();
        
        Mobile obj2 = new Mobile();
        obj2.brand = "Sumsang";
        obj2.price = 75_000;

        obj2.print();

        Mobile.name = "Smartphone";
        obj1.print();


    }
}
