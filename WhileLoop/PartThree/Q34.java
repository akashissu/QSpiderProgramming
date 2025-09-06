package WhileLoop.PartThree;

// WAJP to take user input and count the number
// of binary bits in that number when it is
// represented in binary form.

// n=20 {binary=10100}
// o/p
// 5

public class Q34 {

    public static String getBinary(int n){
        String bin = "";

        while (n>0) {
            int rem = n%2;

            bin = rem + bin;
            n/=2;
        }
        return bin;
    }

    public static void main(String[] args) {
        String result = getBinary(20);
        System.out.println("the Binary Is :"+result);
    }
    
}
