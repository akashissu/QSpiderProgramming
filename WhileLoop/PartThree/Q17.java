package WhileLoop.PartThree;


// Write a java program to take a user input
// and print the sum of each odd digits of
// the number.

// Input:
// N=42763;
// Output:
// 10

public class Q17 {
    public static int printSumOfDigit(int n){
        
        int sum = 0;
        while (n>0) {
            int rem = n%10;
            if(rem%2==1)
            sum = sum + rem;

            n/=10;
        }
        return sum;
        
    }

    public static void main(String[] args) {
        int result = printSumOfDigit(42763);
        System.out.println("The Sum Is :"+result);
    }
    
}
