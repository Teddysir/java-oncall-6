package oncall.model;

import oncall.view.InputView;
import oncall.view.OutputView;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Calendar {

    private int startMonth;
    private String startDay;

    private Map<String, Integer> calendarEnum = new HashMap<>();
    private Map<Integer, String> calendarIntegerEnum = new HashMap<>();


    public void print30Calendar(int month, String day, List<String> staffs) {
        int strDayCount = calendarEnum.get(day); // 예를들어 월이면 1이겠지?
        for (int numDay = 1; numDay <= 30; numDay++) {

            if (numDay % staffs.size() == 0) { // 1 2 3 4 0  / 5
                OutputView.calendar30Message(month, numDay, this.calendarIntegerEnum.get(strDayCount % 7), staffs.get(staffs.size()-1));
                strDayCount++;
            } else {
                OutputView.calendar30Message(month, numDay, this.calendarIntegerEnum.get(strDayCount % 7), staffs.get(numDay % staffs.size() - 1));
                strDayCount++;
            }
        }
    }

    public void print28Calendar(int month, String day, List<String> staffs) {
        int strDayCount = calendarEnum.get(day); // 예를들어 월이면 1이겠지?
        for (int numDay = 1; numDay <= 28; numDay++) {
            if (numDay % staffs.size() == 0) { // 1 2 3 4 0  / 5
                OutputView.calendar28Message(month, numDay, this.calendarIntegerEnum.get(strDayCount % 7), staffs.get(staffs.size()-1));
                strDayCount++;
            } else {
                OutputView.calendar28Message(month, numDay, this.calendarIntegerEnum.get(strDayCount % 7), staffs.get(numDay % staffs.size() - 1));
                strDayCount++;
            }
        }
    }

    public void print31Calendar(int month, String day, List<String> staffs) {
        int strDayCount = calendarEnum.get(day); // 예를들어 월이면 1이겠지?
        for (int numDay = 1; numDay <= 31; numDay++) {
            if (numDay % staffs.size() == 0) { // 1 2 3 4 0  / 5
                OutputView.calendar31Message(month, numDay, this.calendarIntegerEnum.get(strDayCount % 7), staffs.get(staffs.size()-1));
                strDayCount++;
            } else {
                OutputView.calendar31Message(month, numDay, this.calendarIntegerEnum.get(strDayCount % 7), staffs.get(numDay % staffs.size() - 1));
                strDayCount++;
            }
        }
    }

    public void setCalendarIntegerEnum() {
        calendarIntegerEnum.put(1, "월");
        calendarIntegerEnum.put(2, "화");
        calendarIntegerEnum.put(3, "수");
        calendarIntegerEnum.put(4, "목");
        calendarIntegerEnum.put(5, "금");
        calendarIntegerEnum.put(6, "토");
        calendarIntegerEnum.put(0, "일");
    }


    public void setCalendarEnum() {
        calendarEnum.put("월", 1);
        calendarEnum.put("화", 2);
        calendarEnum.put("수", 3);
        calendarEnum.put("목", 4);
        calendarEnum.put("금", 5);
        calendarEnum.put("토", 6);
        calendarEnum.put("일", 0);
    }

    public Map<String, Integer> getCalendarEnum() {
        return calendarEnum;
    }

    public int getStartMonth() {
        return startMonth;
    }

    public String getStartDay() {
        return startDay;
    }

    public void setStartDay(String startDay) {
        this.startDay = startDay;
    }

    public void setStartMonth(int startMonth) {
        this.startMonth = startMonth;
    }
}
