package operationBasedProgramming;

public class LastDigitPrint2 {
    public static void main(String[] args) {
        int n = 5783;

        int firstDigit = (n/1000)%10;
        int firstSecondDigit = (n/100)%10;
        int thirdDigit = (n/10)%10;
        int LastDigit = (n/1)%10;

        System.out.println("First Digit:"+firstDigit);
        System.out.println("First Second Digit:"+firstSecondDigit);
        System.out.println("third Digit:"+thirdDigit);
        System.out.println("Last Digit is:"+LastDigit);
        

    }
}
