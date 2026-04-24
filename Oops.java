import tools.AdvCalc;

public class Oops {
    public static void main(String[] args) {
        AdvCalc obj = new AdvCalc();
        int r1 = obj.add(20, 4);
        int r2 = obj.sub(20, 4);
        int r3 = obj.mul(20, 4);
        int r4 = obj.dev(20, 4);

        System.out.println(r1 + " : " + r2 + " : " + r3 + " : " + r4);
    }
}
