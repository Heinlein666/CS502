package week_6;

public class TestTime {

    public static void main(String[] args) {
        Time time1 = new Time();
        System.out.println("Use setTime method.");
        time1.setTime(11, 11, 11);
        time1.printTime();
        while (true) {
            System.out.println();
            System.out.println("Use random number to initialize time and start a new test.");
            Time time2 = new Time((int) (Math.random() * 24), (int) (Math.random() * 60), (int) (Math.random() * 60));
            System.out.println("_____CLOCK_______");
            int i = 0;
            while (i < 61) {
                try {
                    Thread.sleep(1000);
                    time2.tick();
                    time2.printTime();
                    i++;
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
