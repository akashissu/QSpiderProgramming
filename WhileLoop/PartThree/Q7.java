package WhileLoop.PartThree;


// Write a java program to take a user input
// and count the total digit of the number.
// Input:
// N=43705;
// Output:
// 5


public class Q7 {
        public static int printDigit(int n){
        
        int count = 0;

        while(n>0){

            count++;
            n/=10;    

        }
        return count;     
    }
    public static void main(String[] args) {
        int result = printDigit(43715);
        System.out.println("the Count is :"+result);
        
    }  
    
}
