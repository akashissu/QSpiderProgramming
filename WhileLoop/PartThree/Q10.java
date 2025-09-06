package WhileLoop.PartThree;

// Write a java program to take a user input
// and count how many 0 digit is in number.
// Input:
// N=430705;
// Output:
// 2

public class Q10 {
    public static int countDigit(int n){
        
        int count = 0;

        while(n>0){
            int rem = n%10;
            if(rem == 0){
                count++;
            }
            n/=10;
            
        }
        return count;
    }

    public static void main(String[] args) {
        int result = countDigit(4307005);
        System.out.println("The No Of zero is :"+result);
    }
    
}
