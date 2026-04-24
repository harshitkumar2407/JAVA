 class A {

    public A()
    {
        System.out.println("object created");
    }
    public void show()
    {
        System.out.println("in A show");
    }
    
}
public class NamingConvension {
    
    public static void main(String[] args) 
    {
        
        new A().show(); //anonymous object



    }
}

// Camel casing

// class and interface - Calc,  Runable
// variable and method - marks, show()
// constants = PIE, BRAND   

// showMyMarks()
