package in.arfajsheru.dsalecture.sorting.alogs;

public class BubbleSort implements SortingAlgo{
    public void swap(int[] nums,int i , int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    @Override
    public void sort(int[] nums) {
        printArray(nums);
        for(int i = 0; i < nums.length - 1; i++){
            for(int j = 0; j < nums.length - 1 - i; j++){
                if(nums[j] > nums[j + 1]){
                    swap(nums, j , j+1);
                }
            }
            printArray(nums);
        }
    }

    public static void main(String[] args) {
        SortingAlgo bubblesort = new BubbleSort();
        int[] nums = {9,8,7,6,5,4,3,2,1};
        bubblesort.sort(nums);
        System.out.print("Print BubbleSorted Array: ");
        printArray(nums);
    }

    public static void printArray(int[] nums){
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
