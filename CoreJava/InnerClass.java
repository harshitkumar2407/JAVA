class A
{
    int age;

    public void show()
    {
        System.out.println("in Show");
    }
    class B
    {
        public void config()
        {
            System.out.println("in Config");
        }
    }
}

public class InnerClass {
    public static void main(String[] args) {
        A obj = new A();
        obj.show(); 

        A.B obj1 = obj.new B();
        obj1.config();
    }
}
