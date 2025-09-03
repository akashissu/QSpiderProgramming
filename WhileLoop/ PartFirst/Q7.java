// package WhileLoop. PartFirst;


// WAJP to print and count all the numbers
// from 1 to 1000 which are divisible by 7
// and also ends with 7.

public class Q7 {
    public static void printdivbyseven(){

        int i = 1;

        while(i<=1000){
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
