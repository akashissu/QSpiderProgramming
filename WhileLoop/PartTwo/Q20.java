package WhileLoop.PartTwo;

// WAJP to accept two numbers from user
// and print power of a to b.
// i/p: 6 3
// o/p: 6 to power 3 is: 216

public class Q20 {

    public static int printSeries(int n){
        int sum = 1;
        int i = 1;

        while(i<=3){

            sum *= 6;
            i++;
            }

        System.out.println("The Series Sum Is :"+sum);
        return sum;    
        }
        
    public static void main(String[] args) {
        printSeries(100);
    }
    
}
