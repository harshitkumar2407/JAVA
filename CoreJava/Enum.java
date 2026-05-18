enum Status{
    Running, Failed, Pending, Success;

}

public class Enum {

    public static void main(String[] args) {
        // int i = 5;
        Status  s = Status.Running;
        
        switch (s) {
            case Running:
                System.out.println("All Good");
                break;
            case Failed:
                System.out.println("Try again");
                break;
            case Pending:
                System.out.println("Please wait");
            default:
                System.out.println("Done");
                break;
        }
        Status[] ss = Status.values();
        System.out.println(ss[0]);

        for(Status a:ss)
            System.out.println(a);

    }
}