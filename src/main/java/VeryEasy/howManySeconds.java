package VeryEasy;

public class howManySeconds {
    public static int howManySecondsInHours(int hours) {
        int hour = 60;
        int minute = 60;
        int sec = (hour * minute) * hours;
        return sec;
    }
}
