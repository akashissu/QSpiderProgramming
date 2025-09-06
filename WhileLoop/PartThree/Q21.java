package WhileLoop.PartThree;


// Design a method which will accept a
// number and will return true if all the
// digits of the number is in increasing order.
// Input:
// N=2568;
// Output:
// true

public class Q21 {
    public static boolean isIncreasingDigit(int n){
        
        int prev = n%10;

        n/=10;
        while (n>0) {
            int next = n%10;
            if (next > prev) {
                return false;
            }
            prev = next;
            n/=10;
        }
        return true;
        
    }

    public static void main(String[] args) {
        int n = 3968;
        if(isIncreasingDigit(n)){
            System.out.println("Digit Is Increasing");
        }else{
            System.out.println("Is Not increasing");
        }

    }
    
    
}
