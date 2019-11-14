import java.util.Scanner;
public class QuadraticEquation {
    private double a, b, c;
    private double delta;
    private double x1, x2;

public  QuadraticEquation(){

}

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public double getDelta() {
        return delta;
    }

    public double getRoot1() {
        return x1 = (-this.b + Math.sqrt(delta)) / 2 * this.a;
    }

    public double getRoot2() {
        return x2 = (-this.b - Math.sqrt(delta)) / 2 * this.a;
    }

    public double getDiscriminant() {
        return delta = ((Math.pow(this.b, 2)) - 4 * this.a * this.c);
    }

    public double getDuplication() {
        return x1 = x2 = (-this.b) / 2 * this.a;
    }

    public void nhap() {
    Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập a:");
        this.a=scanner.nextDouble() ;
        System.out.println("Nhập b:");
        this.b=scanner.nextDouble() ;
        System.out.println("Nhập c:");
        this.c=scanner.nextDouble() ;


    }

    public void check () {
        double delta = getDiscriminant();
        System.out.println("delta="+delta);
        if (delta > 0) {
            System.out.println("Phương trình có 2 nghiệm phân biệt:\n"
                    +"x1"+ getRoot1()
                    +"\nX2" +getRoot2());
        }
        else if (delta == 0) {
            System.out.println("Phương trình có 1 nghiệm kép: " + getDuplication());
        } else {
            System.out.println("PT vo nghiem");
        }
    }
}
