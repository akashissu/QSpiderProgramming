package WhileLoop.PartThree;

// Write a java program to take a user input
// and count the even digits of the number.
// Input:
// N=42765;
// Output:
// 3

public class Q12 {

    public static int countDigit(int n){
        
        int count = 0;

        while(n>0){
            int rem = n%10;
            if(rem%2 == 0){
                count++;
            }
            n/=10;
            
        }
        return count;
    }

    public static void main(String[] args) {
        int result = countDigit(42765);
        System.out.println("The No Of even is :"+result);
    }
    
}
