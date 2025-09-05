package WhileLoop.PartTwo;



// WAJP to print sum of all natural
// numbers from 1 to 100.

public class Q1 {
    public static int sumOfNatNumber(int n){

        int sum = 0;
        int i = 0;

        while(i<=n){
            sum += i;
            i++;
            
        }
        System.out.println("The Sum of the Number Is:"+sum);
            
        return sum;
    }

    public static void main(String[] args) {
        sumOfNatNumber(100);
    }
    
}
