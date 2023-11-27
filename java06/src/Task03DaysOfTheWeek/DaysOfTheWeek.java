package Task03DaysOfTheWeek;

public class DaysOfTheWeek {
    enum DayOfWeek {
        SUNDAY,
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY
    }

        public static void main(String[] args) {
        DayOfWeek i = DayOfWeek.SUNDAY;
        switch (i) {
            case MONDAY:
                System.out.println("будний день");
                break;
            case TUESDAY:
                System.out.println("будний день");
                break;
            case WEDNESDAY:
                System.out.println("будний день");
                break;
            case THURSDAY:
                System.out.println("будний день");
                break;
            case FRIDAY:
                System.out.println("будний день");
                break;
            case SATURDAY:
                System.out.println("выходной день");
                break;
            case SUNDAY:
                System.out.println("выходной день");
                break;
            default:
                System.out.println("я не знаю такой день недели");
                break;
        }
    }
}
