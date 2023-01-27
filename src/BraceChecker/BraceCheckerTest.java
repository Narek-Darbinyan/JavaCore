package BraceChecker;

public class BraceCheckerTest {
    public static void main(String[] args) {
        String k="Hello from [Java)";
        BraceChecker braceChecker = new BraceChecker(k);
        braceChecker.check();
    }
}
