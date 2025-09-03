// package WhileLoop. PartFirst;

// WAJP to print all the even numbers from 1 to 100.

public class Q3 {
    public static void printEven(){
        
        int i = 1;
        while(i<=100){
            if(i%2 == 0){
                System.out.println("THe Even Np IS :"+i);
                
            }
            i++;
        }
    }

    public static void main(String[] args) {
        printEven();
    }
    
}
