package WhileLoop.PartThree;


// Write a java program to take a user input
// and print the sum of each digit of the
// number.
// Input:
// N=4207065;
// Output:
// 24

public class Q15 {
    public static int printSumOfDigit(int n){
        
        int sum = 0;
        while (n>0) {
            int rem = n%10;
            sum = sum + rem;

            n/=10;
        }
        return sum;
        
    }

    public static void main(String[] args) {
        int result = printSumOfDigit(4207065);
        System.out.println("The Sum Is :"+result);
    }

    
    
}
