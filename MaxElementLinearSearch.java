public class MaxElementLinearSearch {

    // Function to find maximum element
    public static int findMax(int[] array) {
        if (array.length == 0) {
            throw new IllegalArgumentException("Array is empty");
        }

        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }

    // Main method to test
    public static void main(String[] args) {
        int[] numbers = {45, 12, 98, 23, 76, 3};

        System.out.println("Array:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        int maxValue = findMax(numbers);
        System.out.println("\nMaximum element in the array: " + maxValue);
    }
}
