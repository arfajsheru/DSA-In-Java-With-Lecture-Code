package in.arfajsheru.dsalecture.sorting.alogs;

public class SelectionSort implements SortingAlgo {
    
    public void swap(int[] nums,int i ,int j){
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    @Override
    public void sort(int[] nums) {
        int n = nums.length;
        for(int i = 0; i < n - 1; i++){
            int minindex = i;
            for(int j = i + 1; j < n; j++){
                if(nums[j] < nums[minindex]){
                    minindex = j;
                }
            }
            swap(nums,minindex, i);
            printArray(nums);
        }
    }


    public static void main(String[] args) {
        SortingAlgo selectionSort = new SelectionSort();
        int[] nums = {9,8,7,6,5,4,3,2,1};
        selectionSort.sort(nums);
        System.out.println("Print Selection sorted Array: ");
        printArray(nums);
    }


    public static void printArray(int[] nums){
        for (int num : nums) {
            System.out.print(num+ " ");
        }
        System.out.println();
    }
}
