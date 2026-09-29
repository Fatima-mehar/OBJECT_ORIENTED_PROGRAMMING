class TimeDemo2 {
    public int hr;
    public int min;
    public int sec;

    public TimeDemo2() {
        hr = 0;
        min = 0;
        sec = 0;
    }

    public TimeDemo2(int h, int m, int s) {
        hr = h;
        min = m;
        sec = s;
    }

    public void display() {
        System.out.println("Time is: " + hr + " hr " + min + " min " + sec + " sec");
    }
}

public class Lab2Time {
    public static void main(String[] args) {
        TimeDemo2 t1 = new TimeDemo2();
        t1.display();

        TimeDemo2 t2 = new TimeDemo2(14, 45, 30);
        t2.display();
    }
}