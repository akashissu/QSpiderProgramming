package WhileLoop.PartThree;




// Write a java program to take a user input and print each
// digits of the number one by one from right to left.
// Input:
// N=43705;
// Output:
// 5
// 0
// 7
// 3
// 4

public class Q1 {

    public static int printRighttoLeft(int n){

        int rem = 0;

        while(n>0){
            rem = n%10;
            System.out.println("result :"+rem);
            
            n/=10;
        }
        return rem;
        
    }

    public static void main(String[] args) {

        int result = printRighttoLeft(5627897);
        
        System.out.println("result"+result);
    }
}
