package operationBasedProgramming;

public class reverseUsingAO {
    public static void main(String[] args){
        int n = 321;

        int reverse = (n % 10) * 100 + ((n / 10) % 10) * 10 + (n / 100);
        
        System.out.println("Reverse No is:"+reverse);
    }
}
