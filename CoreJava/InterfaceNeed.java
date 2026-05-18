


interface Computer
{
    void code();
    
}
class Laptop implements Computer
{
    public void code()
    {
        System.out.println("code, compile, run");
    }
}
class Desktop implements Computer
{
    public void code()
    {
        System.out.println("code, compile, run:Faster");
    }
}


class Developer
{
    public void devApp(Computer lap)
    {
        System.out.println("Coding.....");
        lap.code();
    }
}


public class InterfaceNeed 
{
    public static void main(String[] args) {

        Computer lap = new Laptop();
        Computer dec = new Desktop();


        Developer harshit = new Developer();
        harshit.devApp(lap);
        Developer Raju = new Developer();
        Raju.devApp(dec);

    }   
}
