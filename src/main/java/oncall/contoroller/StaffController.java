package oncall.contoroller;

import oncall.model.Staff;
import oncall.utils.ServiceValidation;
import oncall.utils.Splitter;
import oncall.view.InputView;

public class StaffController {

    final Staff staff = new Staff();

    public void start() {
        startMonthAndDay();
        employStaffs();
    }

    private void startMonthAndDay() {
        String rawMonthAndDay = InputView.inputMessageMonthAndDay();

        ServiceValidation.checkedRawInput(rawMonthAndDay);

        String[] splitRawMonthAndDay = Splitter.getSplitMonthAndDay(rawMonthAndDay);

        int startMonth = ServiceValidation.checkedStartMonth(splitRawMonthAndDay[0].trim()); // ex) 12
        ServiceValidation.checkedStartDay(splitRawMonthAndDay[1].trim());
        String startDay = splitRawMonthAndDay[1].trim(); // ex) 월

    }

    private void employStaffs() {
        employWeekdayStaffs();
        employHolidayStaffs();
    }

    private void employWeekdayStaffs() {
        String rawWeekdayStaffs = InputView.inputMessageWeekdayStaffs();
        staff.addedWeekdayStaffs(rawWeekdayStaffs);
    }

    private void employHolidayStaffs() {
        String rawHolidayStaffs = InputView.inputMessageHolidayStaffs();
        staff.addedHolidayStaffs(rawHolidayStaffs);
    }

}
