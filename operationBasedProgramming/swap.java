package operationBasedProgramming;

public class swap {
     public static void main(String[] args) {
        
        int a = 20;
        int b = 40;

        System.out.println("Before Swapping");
        System.out.println(a);
        System.out.println(b);

        int c = a;
        a = b;
        b = c;

        System.out.println("After Swapping With Third Variable");
        System.out.println(a);
        System.out.println(b);
        System.out.println("=====================================");

        System.out.println("Before Swapping");
        System.out.println(a);
        System.out.println(b);

        a = a+b;
        b = a-b;
        a = a-b;

        System.out.println("After Swapping Without Third Variable");
        System.out.println(a);
        System.out.println(b);

     }
    
}
