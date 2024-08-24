import java.util.*;
class Fraction {
    int num, den;
    double n, d;
    public Fraction(int n, int d) {
        this.num = n;
        this.den = d;
    }
    public Fraction(double a, double b) {
        this.n = a;
        this.d = b;
    }
    public Fraction(int a, double b) {
        this.num = a;
        this.d = b;
    }
    public double fracInt() {
        return (double)(num) / (double)(den);
    }
    private double fracD() {
        return n / d;
    }
    private double fracID() {
        return (double)num / d;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 integers : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println("Enter 2 double : ");
        double c = sc.nextDouble();
        double d = sc.nextDouble();
       
        Fraction ob1 = new Fraction(a, b);        
        System.out.println(a + "/" + b + "=" + ob1.fracInt());
       
        Fraction ob2 = new Fraction(c, d);
        System.out.println(c + "/" + d + "=" + ob2.fracD());
       
        Fraction ob3 = new Fraction(a, d);
        System.out.println(a + "/" + d + "=" + ob3.fracID());
    }
}
