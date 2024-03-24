public class BubbleSort {

    public static void bubbleSort(int a[], int size) {
        int outer, inner, temp;
        for (outer = size - 1; outer > 0; outer--) { // counting down
            for (inner = 0; inner < outer; inner++) { // bubbling up
                if (a[inner] > a[inner + 1]) { // if current element is greater than next
                    temp = a[inner]; // swap elements
                    a[inner] = a[inner + 1];
                    a[inner + 1] = temp;


                }
            }
        }
    }
    public static void main(String[] args) {
        // Initialize an array of integers.
        int[] array = {64, 34, 25, 12, 22, 11, 90};
        // Get the size of the array.
        int size = array.length;
        // Call the bubbleSort method to sort the array.
        bubbleSort(array, size);
        // Print the sorted array.
        System.out.println("Sorted array:");
        for (int i = 0; i < size; i++) {
            System.out.print(array[i] + " ");
        }
    }
}