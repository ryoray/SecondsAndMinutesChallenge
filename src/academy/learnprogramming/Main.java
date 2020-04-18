package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        getDurationString(135,27);
    }

    public static int getDurationString (int minutes, int seconds) {
        if ((minutes < 0) || (seconds < 0 || seconds > 59)) {
            return -1;
        }
        int hours = (minutes / 60);
        minutes = (minutes % 60);
        System.out.println(hours + "h " + minutes + "m " + seconds + "s");
        return hours;
    }
}
