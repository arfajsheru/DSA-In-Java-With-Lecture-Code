package in.arfajcoding.dsalecture.sorting.alogs;

public class InsertionSort implements SortingAlgo{
    @Override
    public void sort(int[] nums) {
        for(int i = 1; i < nums.length; i++){
            int key = nums[i];
            int j = i - 1;
            while(j >= 0 && nums[j] > key){
                nums[j+1] = nums[j];
                j--;
            }
            nums[j+1] = key;
            printArray(nums);

        }

    }


    public static void main(String[] args) {
        int[] nums = {6,5,3,1,8,7,2,4};
        SortingAlgo inserSort = new InsertionSort();
        System.out.println("Print insertion sorted array: ");
        inserSort.sort(nums);
        printArray(nums);

    }


    public static void printArray(int[] nums){
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
