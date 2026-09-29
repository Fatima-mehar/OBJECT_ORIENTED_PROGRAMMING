class CircleDemo {
    public double radius;

    public CircleDemo() {
        radius = 1.0;
    }

    public CircleDemo(double r, double unused) {
        radius = r;
    }

    public double calculateCircumference() {
        return (2 * 3.14159 * radius);
    }
}

public class Circle {
    public static void main(String[] args) {
        CircleDemo c1 = new CircleDemo();
        System.out.println("Circumference 1: " + c1.calculateCircumference());

        CircleDemo c2 = new CircleDemo(5.0, 0.0);
        System.out.println("Circumference 2: " + c2.calculateCircumference());
    }
}