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
}
