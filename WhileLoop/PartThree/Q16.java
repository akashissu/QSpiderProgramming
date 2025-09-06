package WhileLoop.PartThree;


// Write a java program to take a user input
// and print the sum of each even digits of
// the number.
// Input:
// N=42765;
// Output:
// 12

public class Q16 {
    public static int printSumOfDigit(int n){
        
        int sum = 0;
        while (n>0) {
            int rem = n%10;
            if(rem%2==0)
            sum = sum + rem;

            n/=10;
        }
        return sum;
        
    }

    public static void main(String[] args) {
        int result = printSumOfDigit(42765);
        System.out.println("The Sum Is :"+result);
    }
    
    
}
