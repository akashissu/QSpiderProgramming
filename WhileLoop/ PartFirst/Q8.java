// package WhileLoop. PartFirst;


// WAJP to count the factors of a
// number.(number itself excluded)

public class Q8 {

    public static int countfactor(int n){
        int count = 1;

        int i = 2;

        while(i*i <= n){
            if(n%i == 0){
                int fact1 = i;
                int fact2 = n/i;

                if(fact1 != fact2){
                    count +=2;
                }
                else{
                    count += 1;
                }
            }
            i++;
        }
        return count;
    }

    public static void main(String[] args) {
       int result = countfactor(28);
       System.out.println("Total number of factors: " + result);
    }
    
}
