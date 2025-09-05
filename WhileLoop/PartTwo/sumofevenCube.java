package WhileLoop.PartTwo;

// WAJP to print sum of cubes of all even
// numbers from 1 to 100.

public class sumofevenCube {
    public static int SumOfEvenCube(int n){
          
        int sum = 0;
        int i = 1;

        while (i<=n) {
            if (i%2 == 0) {
                sum = sum + (i*i*i);

                
            }
            i++;   
        }
        System.out.println("The Sum is :"+sum);
        return sum;
    }
    public static void main(String[] args) {
        SumOfEvenCube(100);
    }
}
