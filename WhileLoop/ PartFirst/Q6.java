// package WhileLoop. PartFirst;



// WAJP to print and count all the numbers from 1 to 100 which are divisible by 7 or
// ends with 7.

public class Q6 {
    public static void printdivbyseven(){

        int i = 1;

        while(i<=100){
            if(i%7 == 0 || i % 10 == 7){
                System.out.println("The Number is "+i);
            }
            i++;
        }
    }

    public static void main(String[] args) {
        printdivbyseven();
    }
    
}
