class Human {

            // age is a instance variabele
    private int age ;
    private String name = "kumar";

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

public class Encapculation {
    public static void main(String[] args) {

        Human hum = new Human();
        hum.setAge(20,hum);

        hum.setName("kumar");
        System.out.println(hum.getAge() + " " + hum.getName());
    }

}
