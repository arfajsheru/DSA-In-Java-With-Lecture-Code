package in.arfajsheru.dsalecture.sorting.alogs;

public class quickSort implements SortingAlgo{

    // private void swap(int[] nums, int i, int j){
    //     int temp = nums[i];
    //     nums[i] = nums[j];
    //     nums[j] = temp;
    // }
    private int partition(int[] nums, int low, int high){ // purpose ak array ko two parts me divide karna left part pivot se se small number or right part pivot se bade number.
        int pivot = nums[high];
        int i = low;
        printArray(nums);

        for(int j = low; j < high; j++){
            if(nums[j] < pivot){
                int temp = nums[i];
                nums[i++] = nums[j];
                nums[j] = temp;
            }
        }
        int temp = nums[i];
        nums[i] = nums[high];
        nums[high] = temp;
        return i;
    }
    private void quicksort(int[] nums, int low, int high){
        if(low < high){
            int partitionIndex = partition(nums, low, high);
            quicksort(nums, 0, partitionIndex - 1);
            quicksort(nums, partitionIndex + 1, high);
        }
    }

    @Override
    public void sort(int[] nums) {
        quicksort(nums,0, nums.length - 1);
    }
    
    
    

    public static void main(String[] args) {
        int[] nums = {2,5,9,8,4,3,1};
        SortingAlgo quickSort = new quickSort();
        quickSort.sort(nums);
        System.out.print("Print quick Sorted array: ");
        printArray(nums);
    }

    private static void printArray(int[] nums){
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
