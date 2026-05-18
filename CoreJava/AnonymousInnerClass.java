class A {
    public void show() {
        System.out.println("in A Show ");
    }
}

public class AnonymousInnerClass {
    public static void main(String[] args) {

        A obj = new A() 
        {
            public void show() 
            {
                System.out.println("in New Show ");
            }
            public void config()
            {
                System.out.println("in Config");
            }
        };
        obj.show();

    }
}
