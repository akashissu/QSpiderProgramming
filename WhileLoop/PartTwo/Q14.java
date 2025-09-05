package WhileLoop.PartTwo;

public class Q14 {
    public static double printSeries(int n){
        double sum = 0;
        int i = 0;

        while(i<=n){
            sum += 1.0 / (i+i);
            i++;
        }
        System.out.println("The Series Sum Is :"+sum);
        return sum;
    }

    public static void main(String[] args) {
        printSeries(100);
    }
}
