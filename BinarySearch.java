public class BinarySearch {

    public static int runBinarySearchIteratively(
            int[] sortedArray, int key, int low, int high) {
        int index = Integer.MAX_VALUE;

        while (low <= high) {
            // Calculate the middle index
            int mid = low + ((high - low) / 2);
            // Check if the key is less than the middle element
            if (sortedArray[mid] < key) {
                // If so, adjust the low index to search the right half
                low = mid + 1;
                // Check if the key is greater than the middle element
            } else if (sortedArray[mid] > key) {
                // If so, adjust the high index to search the left half
                high = mid - 1;
                // Check if the key is equal to the middle element
            } else if (sortedArray[mid] == key) {
                //If so, update the index to the middle index and break the loop
                index = mid;
                break;
            }
        }
        return index;
    }
    public static void main(String[] args) {
        // Define a sorted array to search
        int[] sortedArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int key = 5;
        // Define the low and high for the search
        int low = 0;
        int high = sortedArray.length - 1;
        // Call the binary search method and store the result
        int index = runBinarySearchIteratively(sortedArray, key, low, high);
        // Print the result
        System.out.println("Index of " + key + ": " + index);
    }

}