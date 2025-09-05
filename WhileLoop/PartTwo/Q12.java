package WhileLoop.PartTwo;


// WAJP to print the sum of below series:

// 1
// 2
// ∗ 2 + 2
// 2
// ∗ 3 + 3
// 2
// ∗ 4 ... ... upto 100


public class Q12 {

    public static int printSeries(int n){
        int sum = 0;
        int i = 0;

        while(i<=n){
            sum += i*i+(i+1);
            i++;
        }
        System.out.println("The Series Sum Is :"+sum);
        return sum;
    }

    public static void main(String[] args) {
        printSeries(100);
    }
    
}
