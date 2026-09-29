class MarksDemo {
    public int mark1;
    public int mark2;
    public int mark3;

    public MarksDemo() {
        mark1 = 0;
        mark2 = 0;
        mark3 = 0;
    }

    public MarksDemo(int m1, int m2, int m3) {
        mark1 = m1;
        mark2 = m2;
        mark3 = m3;
    }

    public int calculateSum() {
        return (mark1 + mark2 + mark3);
    }
}

public class Marks {
    public static void main(String[] args) {
        MarksDemo m1 = new MarksDemo();
        System.out.println("Sum 1: " + m1.calculateSum());

        MarksDemo m2 = new MarksDemo(85, 90, 78);
        System.out.println("Sum 2: " + m2.calculateSum());
    }
}