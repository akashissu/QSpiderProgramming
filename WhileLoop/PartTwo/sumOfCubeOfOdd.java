package WhileLoop.PartTwo;

public class sumOfCubeOfOdd {
    public static int SumOfoddCube(int n){
          
        int sum = 0;
        int i = 1;

        while (i<=n) {
            if (i%2 == 1) {
                sum = sum + (i*i*i);

                
            }
            i++;   
        }
        System.out.println("The Sum is :"+sum);
        return sum;
    }
    public static void main(String[] args) {
        SumOfoddCube(100);
    }
}
