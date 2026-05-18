// abstract class A
// {
//     public abstract void show();
//     public abstract void config();
// }
interface A
{
    int age = 44;        //they are by defalt final and static
    String area = "Aligarh";
    void show();
    void config();
}

interface X 
 {
    void run();
    
}

interface Y extends X
 {
    void run();
    
}
class B implements A,Y
{
    public void show()
    {
        System.out.println("in show");
    }
    public void config()
    {
        System.out.println("in config");
    }
    public void run()
    {
        System.out.println("in Run");
    }
}

public class Interfaces {
    public static void main(String[] args) {
        A obj;
        obj = new B(); 
        obj.show();
        obj.config(); 

        // A.area = "Hy";
        System.out.print(obj.area);
    }
}
