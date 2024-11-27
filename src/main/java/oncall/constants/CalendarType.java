package oncall.constants;

public enum CalendarType {

    MONDAY("월",1),
    TUESDAY("화",2),
    WEDNESDAY("수",3),
    THURSDAY("목",4),
    FRIDAY("금",5),
    SATURDAY("토", 6),
    SUNDAY("일",7);

    private final String day;
    private final int numDay;

    CalendarType(String day, int numDay) {
        this.day = day;
        this.numDay = numDay;
    }

    public String getDay() {
        return day;
    }

    public int getNumDay() {
        return numDay;
    }
}
