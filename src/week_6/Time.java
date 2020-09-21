package week_6;

public class Time {
    private int hours;
    private int minute;
    private int second;

    public Time() {};

    public Time (int hours, int minute, int second) {
            this.hours = hours;
            this.minute = minute;
            this.second = second;
    }

    public void setTime(int hours, int minute, int second) {
        this.hours = hours;
        this.minute = minute;
        this.second = second;
    }

    public void printTime() {
        System.out.print("\r" + hours + ":" + minute + ":" + second);
    }

    public void tick() {
        if (second < 59) {
            second++;
        }else {
            second = 0;
            if (minute < 59) {
                minute++;
            }else {
                minute = 0;
                if (hours < 23) {
                    hours++;
                }else{
                    hours = 0;
                }
            }
        }
    }
}
