package WhileLoop.PartThree;


// Write a java program to take a user input
// and print each digits of the number which
// are greater than or equals to 5 one by
// one.

public class Q4 {

    public static int printDigit(int n){
        
        int rem = 0;

        while(n>0){

            rem = n%10;
            if(rem > 5){
                System.out.println("The Number Is :"+rem);
            }
            n/=10;

        }
        return rem;
    }

    public static void main(String[] args) {
        int result = printDigit(76488291);
        System.out.println("The Digit Is"+result);
    }
    
}
