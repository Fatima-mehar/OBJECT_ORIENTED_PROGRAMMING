class DistanceDemo {
    public int feet;
    public int inches;

    public DistanceDemo() {
        feet = 0;
        inches = 0;
    }

    public DistanceDemo(int f, int i) {
        feet = f;
        inches = i;
    }

    public void display() {
        System.out.println("Feet: " + feet + " Inches: " + inches);
    }
}

public class Distance {
    public static void main(String[] args) {
        DistanceDemo d1 = new DistanceDemo();
        d1.display();

        DistanceDemo d2 = new DistanceDemo(5, 8);
        d2.display();
    }
}