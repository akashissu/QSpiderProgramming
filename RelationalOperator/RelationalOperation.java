package RelationalOperator;

public class RelationalOperation {
    public static void main(String[] args) {
        
    // int x = 5, y = 10;
    // System.out.println(x == y == false);

    // int x=64, y=20;
    // System.out.println(x+y>3*y);
    // System.out.println((x+y)/12==0);
    // System.out.println((x+y)/12!=0);
    // System.out.println((x+y)/12==7);
    // System.out.println((x+y)/12!=7);

    // int x=64, y=20, z=1900;

    // System.out.println((x+y)%12==0);
    // System.out.println((x+y)%12!=0);
    // System.out.println(z%100!=0);


    double d = 0.0/0.0;
    System.out.println(d == d);
    System.out.println(d != d);
    System.out.println(d < d);
    System.out.println(d > d);
    System.out.println(d <= d);


    // int x = 5;
    // System.out.println(1 <x< 10);


    char c1 = 'A';
    char c2 = 65;
    System.out.println(c1 == c2);
    System.out.println(c1 < 'a');
    System.out.println('Z' < 'a');


    int p = 3, q = 5;
    System.out.println((p += 2) > (q -= 2));
    System.out.println(p + " " + q);
    
    }
}
