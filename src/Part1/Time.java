package Part1;

public class Time {
    int seconds;
    public Time(int seconds){
        this.seconds = seconds;
    }

    public String conventTime(){
        int hours = seconds / 3600;
        int minutes = (seconds % 3600) / 60;
        int remainingSeconds = seconds % 60;

        if (hours >= 24){
            hours %= 24;
        }
        return hours + ":" + minutes + ":" + remainingSeconds;
    }

    public static void main(String[] args) {
        Time time1 = new Time(10);
        Time time2 = new Time(10000);
        Time time3 = new Time(100000);

        System.out.println(time1.conventTime());
        System.out.println(time2.conventTime());
        System.out.println(time3.conventTime());
    }
}
