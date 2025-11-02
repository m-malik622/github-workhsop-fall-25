public class Calculator {
    public static void main(String[] args) {
        System.out.println("Welcome to the Java Calculator!");
        int a = 10;
        int b = 5;
        System.out.println("Add: " + Operations.add(a, b));
        System.out.println("Subtract: " + Operations.subtract(a, b));
        System.out.println("Multiply: " + Operations.multiply(a, b));
        System.out.println("Divide: " + Operations.divide(a, b));
    }
}
