package brackets;

public class BraceCheckerTest {
    public static void main(String[] args) {

        BraceChecker bc1 = new BraceChecker("Hello from [Java]");
        BraceChecker bc2 = new BraceChecker("Hello from [Java)");
        BraceChecker bc3 = new BraceChecker("Hello from Java]");
        BraceChecker bc4 = new BraceChecker("Hello from {Java");

        System.out.println("--------test bc1--------");
        bc1.check();
        System.out.println("--------test bc2--------");
        bc2.check();
        System.out.println("--------test bc3--------");
        bc3.check();
        System.out.println("--------test bc4--------");
        bc4.check();


    }
}
