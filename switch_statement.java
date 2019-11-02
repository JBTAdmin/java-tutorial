
public class switch_statement {

    public static void main(String[] args) {
        int weekday = 5;
        boolean isWeekend = false;

        SwitchIntMethod(weekday);
        switchBreakUse(isWeekend, weekday);
    }

    private static void switchBreakUse(boolean isWeekend, int weekday) {
        switch (weekday) {
            /*
             * Two cases can be combined in different ways.
             * either by writing case 1,7
             * or
             * case 1:
             * case 2:
             * Both are valid. Though i prefer first option. :)
             */
            case 1, 7:
                isWeekend = true;
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                isWeekend = false;
        }
        System.out.println("Is it Weekend ? " + isWeekend);
    }

    private static void SwitchIntMethod(int weekday) {
        String weekdayString;// switch statement with int data type
        switch (weekday) {
            case 1:
                weekdayString = "Sunday";
                break;
            case 2:
                weekdayString = "Monday";
                break;
            // default statement can be anywhere. Not necessarily in the end only
            default:
                weekdayString = "Not a weekday";
                break;
            case 3:
                weekdayString = "Tuesday";
                break;
            case 4:
                weekdayString = "Wednesday";
                break;
            case 5:
                weekdayString = "Thursday";
                break;
            case 6:
                weekdayString = "Friday";
                break;
            case 7:
                weekdayString = "Saturday";
                // break is not required for last case
        }
        System.out.println(weekdayString);
    }
}