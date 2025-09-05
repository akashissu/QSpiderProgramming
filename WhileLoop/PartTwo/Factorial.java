package WhileLoop.PartTwo;

public class Factorial {
    public static int printSeries(int n){
        int  sum = 1;
        int i = 1;

        while(i<=n){
            sum = sum*i;
            i++;
            }

        System.out.println("The Factorial Is :"+sum);
        return sum;  
            
        }

        public static void main(String[] args) {
        printSeries(6);
        }
    }        
        
     
    
