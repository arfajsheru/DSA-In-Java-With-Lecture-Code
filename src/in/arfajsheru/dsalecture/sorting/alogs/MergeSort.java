package in.arfajsheru.dsalecture.sorting.alogs;

public class MergeSort implements SortingAlgo{
    
    private void mergeSort(int[] nums){ // Divide array logic
        int n = nums.length;
        if (n < 2){ // base condition if n , 2 se small he to return karo array is already sorted.
            return;
        }

        int mid = n / 2;
        int[] left = new int[mid];
        int[] right = new int[n - mid];

        for (int i = 0; i < mid; i++){
            left[i] = nums[i];
        }
        for (int i = mid; i < n; i++){
            right[i - mid] = nums[i];
        }

        mergeSort(left);
        mergeSort(right);
        merge(nums, left, right);
    }

    private void merge(int[] result, int[] first, int[] second){   // Actual merge logic
        int i = 0, j = 0, k = 0;

        while (i < first.length && j < second.length){
            if(first[i] <= second[j]){
                result[k++] = first[i++];
            } else {
                result[k++] = second[j++];
            }
        }

        while (i < first.length){
            result[k++] = first[i++];
        }

        while(j < second.length){
            result[k++] = second[j++];
        }
    }


    @Override // Main sorting function
    public void sort(int[] nums) {
        mergeSort(nums);
    }

    public static void main(String[] args) { // Main methode
        int[] nums = {8,6,14,77,1,13,2};
        SortingAlgo mergeSort = new MergeSort();
        mergeSort.sort(nums);
        System.out.print("Print Merge Sorted array: ");
        printArray(nums);
    }

    private static void printArray(int[] nums){  // Print array methode
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
