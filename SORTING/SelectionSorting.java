package SORTING;

public class SelectionSorting{
    public static void selectionSort(int arr[]) {
        // Outer loop to go through the array
        for (int i = 0; i < arr.length - 1; i++) {
            int minPosition = i;  // Assume the current position is the smallest
            // Inner loop to find the actual smallest element in the unsorted part
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[minPosition] > arr[j]) {
                    minPosition = j;  // Update the minPosition if a smaller element is found
                }
            }
            // Swap the smallest element with the first element of the unsorted part
            int temp = arr[minPosition];
            arr[minPosition] = arr[i];
            arr[i] = temp;
        }
    }

    // Method to print the array
    public static void printArr(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");  // Print elements in one line separated by space
        }
        System.out.println();  // Add a new line after printing the array
    }

    public static void main(String[] args) {
        int arr[] = {5, 4, 1, 3, 2};  // Array to be sorted
        selectionSort(arr);           // Sort the array using Selection Sort
        printArr(arr);                // Print the sorted array
    }
}




