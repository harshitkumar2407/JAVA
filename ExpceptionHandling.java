class HarshitException extends Exception
{
    public HarshitException(String string)
    {
        super(string);
    }
}

public class ExpceptionHandling {
     public static void main(String[] args) {
        
        int i = 2;
        int j = 0;
        int num [] = new int[5];
        try {
            j= 0/i;
            // System.out.println(num[1]);
            // System.out.println(num[5]);
            if (j==0) {
                throw new HarshitException("I dont want to print zeero");
            }

        } catch (ArithmeticException e) 
        {
            System.out.println("Can not devide by zero");
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("You are out of limit");
        }catch (Exception e){
            System.out.println("Something went wrong..... \n\n " + e + "\n");
        }

        System.out.println(j);

        System.out.println("Bye");
     }
}
