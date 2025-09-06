package WhileLoop.PartThree;

// Write a java program to take a user input
// and print the biggest digit of the number.
// Input:
// N=43705;
// Output:
// 7

public class Q5 {
    public static int printDigit(int n){

        int big = 0;

        while (n>0) {
            int rem = n%10;
            if(rem>big){
                big = rem;

            }
            
            //System.out.print("The Biggest is :"+big);

            n/=10;
        }
        return big;
    }
    public static void main(String[] args) {
        int result = printDigit(43705);
        System.out.print("The Biggest is :"+result);
    }
}
