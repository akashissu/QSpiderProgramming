package WhileLoop.PartThree;

// Write a java program to take a user input
// and print the difference of biggest digit
// and smallest digit of the number.
// Input:
// N=42375;
// Output:
// 5

public class Q6 {
    public static int printDigit(int n){

        int big = 0;
        int small = n%10;

        while (n>0) {
            int rem = n%10;
            if(rem>big){
                big = rem;
            }
            
            if(rem < small){
                small = rem;
            }

            n/=10;
        }
        return big-small;
    }
    public static void main(String[] args) {
        int result = printDigit(43715);
        System.out.print("The Difference :"+result);
    }
    
}
