package WhileLoop.PartTwo;


// WAJP to print sum of squares of all
// natural numbers from 1 to 100.

// 1
// 2 + 2

// 2 + 3

// 2 + ⋯ ... upto 100

public class Q4 {

    public static int sumOfSquare(int n){

        int sum = 0;
        int i = 0;

        while (i<=n) {
            sum += i*i;
            i++;
        }
        System.out.println("the Sum Is: "+sum);
        return sum;
    }

    public static void main(String[] args) {
        sumOfSquare(100);
    }
    

}
