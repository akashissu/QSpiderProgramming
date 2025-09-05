package WhileLoop.PartTwo;


// WAJP to print sum of cubes of all natural
// numbers from 1 to 100.

public class Q5 {

    public static int sumOfCube(int n){

        int sum = 0;
        int i = 0;

        while (i<=n) {
            sum += i*i*i;
            i++;
        }
        System.out.println("the Sum Is: "+sum);
        return sum;
    }

    public static void main(String[] args) {
        sumOfCube(100);
    }
    
}
