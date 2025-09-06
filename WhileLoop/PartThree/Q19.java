package WhileLoop.PartThree;

// Write a java program to take a user input
// and print the product of each digit of the
// number will be even or Odd.

// Input:
// N=9735;
// Output:
// It will give Odd Product

public class Q19 {

    public static int printProdOfDigit(int n){
        
        int prod = 1;
        while (n>0) {
            int rem = n%10;
            
            prod = prod * rem;

            if (prod%2 == 0) {
                System.out.println("This Is Even");
            }else{
                System.out.println("This Is Even");
            }
                

            n/=10;
        }
        return prod;
        
    }

    public static void main(String[] args) {
        int result = printProdOfDigit(9735);
        System.out.println("The Sum Is :"+result);
    }

    //! Confusion Hai Issme.....
}
