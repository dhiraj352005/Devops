public class Hello {

    public static boolean test() {
        return true;   
    }

    public static void main(String[] args) {
        System.out.println("Hello Jenkins CI - Assignment 7");

        if(test()) {
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed!");
            System.exit(1);
        }
    }
}
