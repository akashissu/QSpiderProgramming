package operationBasedProgramming;


// Shambhu Kumar QSpiders | JSpiders,

// NOIDA

// For a given number int n=5783;
// a. Print the last digit of the number
// b. Print the last two digit of the number
// c. Remove the last digit of the number
// d. Remove the last two digit of the number


public class LastDigitPrint {
    public static void main(String[] args) {
    int n = 5783;
    
    int lastDigit = n%10;
    int lastTwoDigit = n%100;
    int removeLastDigit = (n/1)%10;
    int removeLastTwoDigit = (n/10)%10;
    
    System.out.println("Last Digit Is:"+lastDigit);
    System.out.println("Last Digit Is:"+lastTwoDigit);
    System.out.println("Last Digit Is:"+removeLastDigit);
    System.out.println("Last Digit Is:"+removeLastTwoDigit);
       
    } 
}

//Print the last two digit of the number


