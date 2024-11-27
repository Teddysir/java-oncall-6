package oncall.model;

import oncall.view.OutputView;

import java.util.List;

public class Calendar {

    private int startMonth;
    private String startDay;


    public void print30Calendar(int month, String day, List<String> staffs) {
        for (int numDay = 1; numDay <= 30; numDay++) {
            if (numDay == 1) {
                OutputView.calendar30Message(month, numDay, day, staffs.get(0));
            }
            OutputView.calendar30Message(month, numDay, day, staffs.get(numDay % staffs.size()));
        }
    }

    public void print28Calendar(int month, String day, List<String> staffs) {
        for (int numDay = 1; numDay <= 28; numDay++) {
            if (numDay == 1) {
                OutputView.calendar30Message(month, numDay, day, staffs.get(0));
            }
            OutputView.calendar30Message(month, numDay, day, staffs.get(numDay % staffs.size()));
        }
    }

    public void print31Calendar(int month, String day, List<String> staffs) {
        for (int numDay = 1; numDay <= 31; numDay++) {
            if (numDay == 1) {
                OutputView.calendar30Message(month, numDay, day, staffs.get(0));
            }
            OutputView.calendar30Message(month, numDay, day, staffs.get(numDay % staffs.size()));
        }
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
