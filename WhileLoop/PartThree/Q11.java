package WhileLoop.PartThree;

// Write a java program to take a user input
// and count how many 3 has appeared in
// the number
// Input:
// N=4373533;
// Output:
// 4

public class Q11 {

        public static int countDigit(int n){
        
        int count = 0;

        while(n>0){
            int rem = n%10;
            if(rem == 3){
                count++;
            }
            n/=10;
            
        }
        return count;
    }

    public static void main(String[] args) {
        int result = countDigit(4373533);
        System.out.println("The No Of zero is :"+result);
    }
    
}
