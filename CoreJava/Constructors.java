class Human {

    private int age ;
    private String name ;

    

    public Human(int age) {
        this.age = age;
    }// by right click and source action then generate constructor

    public Human() //Constructor
    {
        // System.out.println("in constructor");
        age = 12;
        name = "john";
    }
    public Human(int a,String name){
        age = a;
        this.name = name;
    }

    public int getAge() {
        return age;
    }
                        // a is local variable
    public void setAge(int age,Human hum) {
        Human hum1 = hum ;
        hum1.age = age;
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    
   
}

public class Constructors {
    public static void main(String[] args) {

        Human hum = new Human();
        System.out.println(hum.getAge() + " " + hum.getName());
        hum.setAge(20,hum);
        hum.setName("kumar");
        System.out.println(hum.getAge() + " " + hum.getName());
        
        Human obj2 = new Human(12,"king");
        System.out.println(obj2.getAge() + " " + obj2.getName());
        
        
    }

}
