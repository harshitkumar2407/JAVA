class A extends Object
{
    public A()
    {
        System.out.println("in A");
    }
    public A(int n)
    {
        System.out.println("in A " + n);
    }
}
class B extends A
{
    public B()
    {
        super();
        System.out.println("in B");
    }
    public B(int n)
    {
        // super(n);
        this();
        System.out.println("in B " + n);
    }
}

public class MethodOverloading {
    public static void main(String[] args) {
        B obj = new B(5 );

    }
}
