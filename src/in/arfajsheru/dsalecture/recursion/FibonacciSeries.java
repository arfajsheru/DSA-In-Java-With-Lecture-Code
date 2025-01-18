package in.arfajsheru.dsalecture.recursion;

public class FibonacciSeries {
    public static void main(String[] args) {
        int terms = 10;
        for(int i = 0; i < terms; i++){
            System.out.print(findFibonacci(i) + " ");
        }
    }

    public static int findFibonacci(int number){
     if(number == 0){
        return 0;
     }
     if(number == 1){
        return 1;
     }
     return findFibonacci(number - 1) + findFibonacci(number - 2);
    }
}
