
public class switch_statement {

    public static void main(String[] args) {
        int weekday = 6;
        String weekdayString = "Friday";
        boolean isWeekend = false;

        switchIntMethod(weekday);
        switchStringMethod(weekdayString);
        switchBreakUse(isWeekend, weekday);
        switchExtendedVersion(weekday);
    }

    private static void switchExtendedVersion(int weekday) {
        // Switch expression is used to assign the result value to local value
        boolean isWeekend = switch (weekday) {
            case 1, 7 -> true;
            case 2, 3, 4, 5, 6 -> false;
            /*
             * Here default is mandated by compiler.
             * As 'switch' expression needs to cover all possible values.
             */
            default -> throw new IllegalStateException("Unexpected value: " + weekday);
        };
        System.out.println("Is it Weekend ? " + isWeekend);
    }

    private static void switchStringMethod(String weekdayString) {
        {
            int weekdayInt;
            switch (weekdayString.toUpperCase()) {
                case "SUNDAY":
                    weekdayInt = 1;
                    break;
                case "MONDAY":
                    weekdayInt = 2;
                    break;
                default:
                    weekdayInt = 0;
                    break;
                case "TUESDAY":
                    weekdayInt = 3;
                    break;
                case "WEDNESDAY":
                    weekdayInt = 4;
                    break;
                case "THURSDAY":
                    weekdayInt = 5;
                    break;
                case "FRIDAY":
                    weekdayInt = 6;
                    break;
                case "SATURDAY":
                    weekdayInt = 7;
            }
            System.out.println(weekdayInt + " DAY OF THE WEEK");
        }
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

    private static void switchIntMethod(int weekday) {
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