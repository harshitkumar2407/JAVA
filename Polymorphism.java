class A
{
    public void show()
    {
        System.out.println("in A Show");
    }
}
class B extends A
{
    public void show()
    {
        System.out.println("in B Show");
    }   
}
class C extends B 
{
    public void show()
    {
        System.out.println("in C Show");
    }   
    
}

public class Polymorphism {
    public static void main(String[] args) {
        A obj = new B();
        obj.show();

        obj = new B();
        obj.show();

        obj = new C();
        obj.show();

    }
    
}
