package WhileLoop.PartThree;

// Design a method which will accept a
// number and will return true if all the
// digits of the number is in decreasing
// order.
// Input:
// N=7652;
// Output:
// true

public class Q22 {
    public static boolean numberDecresing(int n){
        int prev = n%10;
        n/=10;

        while(n>0){
            int next = n%10;
            if(next<prev){
                return false;
            }
            else{
                prev = next;
                n/=10;
            }
        }
        return true;
    }

        public static void main(String[] args) {
        int n = 9896;
        if(numberDecresing(n)){
            System.out.println("Digit Is Decreasing");
        }else{
            System.out.println("Is Not Decreasing");
        }
    
}
}
