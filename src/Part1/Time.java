package Part1;
// 1.1.4 Время
public class Time {
    private int hours, minutes, seconds;
    public Time(int seconds){
        this(0, 0, seconds);
    }
    public Time(int hours, int minutes, int seconds) {
        if (hours > 24 || seconds > 24 * 3600) {
            hours %= 24;
        }
        this.seconds = hours * 3600 + minutes * 60 + seconds;
    }

    public int getHours() {
        hours = seconds / 3600;
        if (hours >= 24){
            hours %= 24;
        }
        return hours;
    }

    public int getMinutes() {
        minutes = (seconds % 3600) / 60;
        return minutes;
    }
    public int getMinutes(int hours) {
        minutes = hours * 60;
        return minutes;
    }

    public int getSeconds() {
        seconds = seconds % 60;
        return seconds;
    }
    public int getSeconds(int minutes) {
        seconds = minutes * 60;
        return seconds;
    }

    public String conventTime(){
        return getHours() + ":" + getMinutes() + ":" + getSeconds();
    }

}
