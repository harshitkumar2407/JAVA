class   A
{
    public void show1()
    {
        System.out.println("in A show");
    }
}
class B extends A
{
    public void show2()
    {
        System.out.println("in B show");
    }
}
public class TypeCasting {
    public static void main(String[] args) {
        A obj = new A();
        obj.show1();

        A obj1 =(A) new B();
        obj1.show1();// UP casting

        B obj2 =  (B) obj1;
        obj2.show2(); // DOWN casting

    }   
}
