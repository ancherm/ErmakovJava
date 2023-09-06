package Part1_1;

public class Time {
    public int seconds;

    public String convertTime(){
        int hours = seconds / 3600;
        int minutes = (seconds % 3600) / 60;
        int remainingSeconds = seconds % 60;

        if (hours >= 24){
            hours %= 24;
        }
        return hours + ":" + minutes + ":" + remainingSeconds;
    }
}
