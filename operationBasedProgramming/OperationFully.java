package operationBasedProgramming;

public class OperationFully {
    public static void main(String[] args) {
        int x = 1 + 2 * 3 / 4;
        int y = 100/10*2%3;
        System.out.println(x); 
        System.out.println(y); 
        //System.out.println(0/0); its Shows Exception
        System.out.println(0.0/0.0);//NaN
        System.out.println(1.0/0.0);
        System.out.println(-1.0/0.0);
    }
}
