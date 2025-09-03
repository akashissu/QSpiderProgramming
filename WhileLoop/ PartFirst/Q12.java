// package WhileLoop. PartFirst;


// WAJP to print all the terms of Fibonacci
// series up to n.
// i/p: 7
// o/p: 0 1 1 2 3 5 8 13

public class Q12 {
    public static void printFibbo(int n){
        if(n < 0){
            System.out.println("invalid input");
            return;
        }
        

            int n1 = 0;
            int n2 = 1;

            int i = 0;

        while(i<=n){
        System.out.println(n1+" ");

        int n3 = n1 + n2;

        n1 = n2;
        n2 = n3;
        i++;
    }
    }



    public static void main(String[] args) {
        printFibbo(7);
    }
    
}
