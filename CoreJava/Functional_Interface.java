@FunctionalInterface
interface A {
    // SAM Single Abstract Method Interface
    // void show(int i);  
    int add(int i, int j);  
}


public class Functional_Interface {
    public static void main(String[] args) {
        // A obj = new A()
        // {
        //     public void show()
        //     {
        //         System.out.println("in Show");
        //     }
        // };
        
        // A obj = (int i) -> System.out.println("in show " + i);
        
        // A obj = i -> System.out.println("in show " + i);
        // obj.show(5);

        A obj = (i,j) ->  i+j;
        int result = obj.add(5,9);
        System.out.println(result);
        // System.out.println(re);

    }
}
