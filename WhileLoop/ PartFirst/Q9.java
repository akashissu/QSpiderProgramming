// package WhileLoop. PartFirst;


// WAJP to print all the factors of a
// number.(number itself excluded)
// i/p: 28
// o/p: 1 2 4 7 14

public class Q9 {
    public static void printfactor(int n){
        System.out.println(1+" " +n+" ");
        int i = 1;

        while (i*i <= n) {
            if(n%i==0){
                int fact1 = i;
                int fact2 = n/i;

                if(fact1 != fact2){
                    System.out.println(fact1 + " " + fact2 +" ");
                    
                }else{
                    System.out.println(fact1 + " ");
                }
            }
            i++;
            
        }
    }

    public static void main(String[] args) {
        printfactor(28);
    }
    
}
