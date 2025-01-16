package in.arfajsheru.dsalecture.binarySearch.algos;

public class BinarySearch {
    public static void main(String[] args) {
        int result = search(new int[] {1,2,3,4,5,6,7,8,9,10,11,12}, 5);
        System.out.println(result);
    }    

    public static int search(int[] sortedArray, int target){
        int beg = 0, end = sortedArray.length -1;
   
        while (beg <= end) {
            int mid = beg + (end - beg) / 2;
            if(sortedArray[mid] == target){
                System.out.printf("Your target %d number in the array index number: " ,target);
                return mid;
            } else if(target < sortedArray[mid]){
                end = mid - 1;
            }
            else{
                beg = mid + 1;
            }
        }
        
        return -1;
    }
}