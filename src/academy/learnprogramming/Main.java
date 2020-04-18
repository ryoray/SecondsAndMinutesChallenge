package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

        System.out.println(getDurationString(65L, 45L));
        System.out.println(getDurationString(3945L));
    }

    private static String getDurationString (long minutes, long seconds) {
        if ((minutes < 0) || (seconds < 0 || seconds > 59)) {
            return "Invalid Value";
        }

        long hours = (minutes / 60);
        long remainingMinutes = (minutes % 60);

        String stringHours = hours + "h ";
        if (hours < 10) {
            stringHours = "0" + stringHours;
        }

        String stringMinutes = remainingMinutes + "m ";
        if (remainingMinutes < 10) {
            stringMinutes = "0" + stringMinutes;
        }

        String stringSeconds = seconds + "s";
        if (seconds < 10) {
            stringSeconds = "0" + stringSeconds;
        }

        return stringHours + stringMinutes + stringSeconds;
    }

    private static String getDurationString (long seconds) {
        if (seconds < 0) {
            return "Invalid Value";
        }

        long minutes = seconds / 60;
        long remainingSeconds = seconds % 60;

        return getDurationString(minutes, remainingSeconds);
    }
}
