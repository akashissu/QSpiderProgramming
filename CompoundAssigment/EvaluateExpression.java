package CompoundAssigment;

public class EvaluateExpression {
    public static void main(String[] args) {
        // int a = 8,b = 4, c = 2;
        // a+= (a+b-c)/2;

        int n = 436;
        n/=10;

        int num = 7;
        num/=2;

        int ni=36;
        ni*=2;
        ni*=2;

        int k = 3;
        k *= k += k - 1;

        int a = 2, b = 3, c = 4;
        a += b += c *= 2;
        

        int numb = 29;
        numb %= 5 + 3;
        
        
        
        System.out.println(a);
        System.out.println(n);
        System.out.println(num);
        System.out.println(ni);
        System.out.println(k);
        System.out.println(a + " " + b + " " + c);
        System.out.println(numb);

    }
    
}
