package operationBasedProgramming;

public class LastDigitWithoutusingModules {
    public static void main(String[] args) {
        int n = 12345;

        int lastDigit = n - (n/10)*10;
        System.out.println("Last Digit Of number:"+lastDigit);
    }
}

