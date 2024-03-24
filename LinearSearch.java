public class LinearSearch {

    public static int search(int arr[], int x) {
        // Get the length of the array
        int n = arr.length;
        // Loop through each element in the array
        for (int i = 0; i < n; i++) {
            // Check if the current element is equal to the target value
            if (arr[i] == x) {
                return i; // Element found, return its index
            }
        }
        return -1; // Element not found
    }

    public static void main(String[] args) {
        // Define an array of integers
        int[] arr = {5, 3, 7, 1, 9, 2};
        // Define the target value to search for
        int target = 7;
        // Call the search method with the array and target value
        int result = search(arr, target);
        if (result != -1) {
            // Print the index where the element was found
            System.out.println("Element found at index: " + result);
        } else {
            // If the element was not found, print a message
            System.out.println("Element not found in the array.");
        }
    }
}