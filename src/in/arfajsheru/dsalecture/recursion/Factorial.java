package in.arfajsheru.dsalecture.recursion;
public class Factorial {
    public static void main(String[] args) {
        int result = findFactorial(3);
        System.out.println(result);
    }


    public static int findFactorial(int number){
        int fac = 1;
        if(number > 1){ //base condition
            return findFactorial(number - 1) * number; // decomposition  and compositon means combine the result;
        }
        return fac;
    }
}
