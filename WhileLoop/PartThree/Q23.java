package WhileLoop.PartThree;

// Design a method which will accept a
// number and will return true if it has
// different adjacent digits.
// Input:
// N=726352;
// Output:
// true

public class Q23 {

    public static boolean numberDecresing(int n){
        int prev = n%10;
        n/=10;

        while(n>0){
            int next = n%10;
            if(next == prev){
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
        int n = 9996;
        if(numberDecresing(n)){
            System.out.println("ha Bhai Adajencent Differ hai");
        }else{
            System.out.println("nahi Bhai Adajencent Differ nahi hai");
        }
    
    
}
}
