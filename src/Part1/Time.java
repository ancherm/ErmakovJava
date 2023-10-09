package Part1;
// 1.1.4 Время
public class Time {
    private int seconds;
    public Time(int seconds){
        this(0, 0, seconds);
    }
    public Time(int hours, int minutes, int seconds) {
        this.seconds = hours * 3600 + minutes * 60 + seconds;
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

}
