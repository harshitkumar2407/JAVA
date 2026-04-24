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

        
        
        
        // System.out.println(s);
        // for (Status status : s) {
        //     System.out.println(status);
        // }

        // if(s == Status.Running)
        //     System.out.println("All Good");
        // else if(s == Status.Failed)
        //     System.out.println("Try Again");
        // else if(s == Status.Pending)
        //     System.out.println("Please wait");
        // else 
        //     System.out.println("Done");
    }
}