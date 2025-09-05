package WhileLoop.PartTwo;


// WAJP to print the sum of below series:

// 1

// 1
// +
// 1

// 2
// +
// 1

// 3
// +
// 1

// 4
// ... ... upto 100

public class Q13 {

    public static double printSeries(int n){
        double sum = 0;
        int i = 0;

        while(i<=n){
            sum += 1.0 / (i+1);
            i++;
        }
        System.out.println("The Series Sum Is :"+sum);
        return sum;
    }

    public static void main(String[] args) {
        printSeries(100);
    }
 
}
