class A {
    public void show()
    {
        System.out.println("in A show ");
    }
    public void config()
    {
        System.out.println("in A Config");
    }
}
class B extends A
{
    public void show()
    {
        System.out.println("in B show ");
    }

}


public class InheritanceMethodOverriding {
    public static void main(String[] args) {
        B obj = new B();
        obj.show();
    }
}
