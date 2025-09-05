package WhileLoop.PartTwo;

public class Q16 {
    public static double printSeries(int n){
        double sum = 0;
        int i = 1;

        while(i<=n){

            if(i%2 == 0){
               sum += 1.0 / (i*i);
            }
            
            i++;
        }
        System.out.println("The Series Sum Is :"+sum);
        return sum;
    }

    public static void main(String[] args) {
        printSeries(100);
    }
}

