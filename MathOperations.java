public class MathOperations {
    public int add(int a, int b) {
        return a + b;
    }
    public double add(double a, double b, double c) {
        return a + b + c;
    }
    public String add(String a, String b) {
        return a + b;
    }

    public static void main(String[] args) {
        MathOperations mathOps = new MathOperations();
        int sum1 = mathOps.add(5, 3);
        System.out.println("Sum of integers: " + sum1);
        double sum2 = mathOps.add(2.5, 3.7, 1.8);
        System.out.println("Sum of doubles: " + sum2);
        String result = mathOps.add("Hello, ", "world!");
        System.out.println("Concatenated string: " + result);
    }
}
