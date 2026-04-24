class A 
{
    public void showTheDataWhichBelongToThisClass()
    {
        System.out.println("in class A");
    }
}
class B extends A
{
    @Override
    public void showTheDataWhichBelongToThisClass()
    {
        System.out.println("in B show");
    }
}


public class Annotations {
    public static void main(String[] args) {
    B obj = new B();
    
    obj.showTheDataWhichBelongToThisClass();
    }    
}
