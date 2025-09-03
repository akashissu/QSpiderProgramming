// package WhileLoop. PartFirst;

public class Q4 {
    public static void printOdd(){

        int i = 1;

        while(i<=100){
            if(i%2 == 1){
                System.out.println("The Number is "+i);
            }
            i++;
        }
    }

    public static void main(String[] args) {
        printOdd();
    }
    
}
