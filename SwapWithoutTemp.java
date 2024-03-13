public class SwapWithoutTemp {
    public static void main(String[] args) {
        int a = 200, b = 300;
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        swapWithoutTemp(a, b);
    }

    public static void swapWithoutTemp(int a, int b) {
        System.out.println("After swapping: a = " + b + ", b = " + a);
    }
}
