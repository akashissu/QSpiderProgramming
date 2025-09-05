package WhileLoop.PartTwo;

// WAJP to print sum of all Odd numbers
// from 1 to 100.

public class Q3 {
    public static int printevenNatNumb(int n){
           
        int sum = 0;
        int i = 0;

        while(i<=n){
            if(i%2 != 0){
                sum += i;
                
            }
            i++;
        }
        System.out.println("The Sum is :"+sum);
        return sum;
    }
    public static void main(String[] args) {
        printevenNatNumb(100);
    }
    
}
