public class Array {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the array size: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter the array elements:");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Sorted array: " + Arrays.toString(arr));
        System.out.print("particular number : ");
        int targetNumber = scanner.nextInt();
        int occurrences = findOccurrences(arr, targetNumber);
        System.out.println("Number of occurrences" + targetNumber + ": " + occurrences);
    }
    public static int findOccurrences(int[] arr, int target) {
        int occurrences = 0;
        for (int num : arr) {
            if (num == target) {
                occurrences++;
            } else if (num > target) {
                break; 
            }
        }
        return occurrences;
    }
}
