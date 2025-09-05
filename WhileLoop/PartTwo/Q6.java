package WhileLoop.PartTwo;


// WAJP to print sum of squares of all even
// numbers from 1 to 100.

public class Q6 {
    public static int squareevenSum(int n){

        int sum = 0;
        int i = 0;

        while (i<=n) {
            if(i%2==0){
                sum += i*i;
            }
            i++;
            
        }
        System.out.println("The Sum Is :"+sum);
        return sum;
    }

    public static void main(String[] args) {
        squareevenSum(100);
    }
    
}
