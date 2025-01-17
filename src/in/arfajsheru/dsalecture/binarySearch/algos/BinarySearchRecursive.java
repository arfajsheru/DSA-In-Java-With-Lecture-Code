package in.arfajsheru.dsalecture.binarySearch.algos;

public class BinarySearchRecursive {

    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 7, 9, 11 };
        int target = 3;
        int result = RecursivelyBinarySearch(arr, target, 0, arr.length - 1);

        if (result != -1) {
            System.out.println("Target " + target + " found at index: " + result);
        } else {
            System.out.println("Target " + target + " not found.");
        }
    }

    public static int RecursivelyBinarySearch(int[] arr, int target, int left, int right) {
        if (left > right) {
            return -1; // Target nahi mila
        }

        int mid = left + (right - left) / 2; // Overflow se bachne ke liye
        if (arr[mid] == target) {
            return mid; // Target mil gaya
        } else if (arr[mid] < target) {
            return RecursivelyBinarySearch(arr, target, mid + 1, right); // Right half me search karo
        } else {
            return RecursivelyBinarySearch(arr, target, left, mid - 1); // Left half me search karo
        }
    }
}
