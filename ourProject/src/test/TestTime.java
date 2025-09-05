import java.time.LocalTime;

public class TestTime {
    public static void test() {
        Time t = new Time(LocalTime.of(8, 30), LocalTime.of(10, 0));
        t.showTime();
        System.out.println("Is start before end? " + t.isStartBeforeEnd());
        t.addMinutesToEnd(15);
        System.out.println("After add 15 minutes to end:");
        t.showTime();
    }

    public static void main(String[] args) {
        test();
    }
}
