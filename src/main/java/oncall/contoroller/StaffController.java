package oncall.contoroller;

import oncall.model.Calendar;
import oncall.model.Staff;
import oncall.utils.ServiceValidation;
import oncall.utils.Splitter;
import oncall.view.InputView;

public class StaffController {

    final Staff staff = new Staff();
    final Calendar calendar = new Calendar();

    public void start() {
        startMonthAndDay();
        employStaffs();
        printCalendar();
    }


    private void startMonthAndDay() {
        String rawMonthAndDay = InputView.inputMessageMonthAndDay();

        ServiceValidation.checkedRawInput(rawMonthAndDay);

        String[] splitRawMonthAndDay = Splitter.getSplitMonthAndDay(rawMonthAndDay);

        int startMonth = ServiceValidation.checkedStartMonth(splitRawMonthAndDay[0].trim()); // ex) 12
        ServiceValidation.checkedStartDay(splitRawMonthAndDay[1].trim());
        String startDay = splitRawMonthAndDay[1].trim(); // ex) 월

        calendar.setStartMonth(startMonth);
        calendar.setStartDay(startDay);

    }

    private void employStaffs() {
        employWeekdayStaffs();
        employHolidayStaffs();
        ServiceValidation.checkedUnEmployedStaff(staff.getWeekdayStaffs(), staff.getHolidayStaffs());
    }

    private void employWeekdayStaffs() {
        String rawWeekdayStaffs = InputView.inputMessageWeekdayStaffs();
        staff.addedWeekdayStaffs(rawWeekdayStaffs);
    }

    private void employHolidayStaffs() {
        String rawHolidayStaffs = InputView.inputMessageHolidayStaffs();
        staff.addedHolidayStaffs(rawHolidayStaffs);
    }

    private void printCalendar() {
        System.out.println();
        if(calendar.getStartMonth() == 4 || calendar.getStartMonth() == 6 || calendar.getStartMonth() == 9 || calendar.getStartMonth() == 11) {
            calendar.print30Calendar(calendar.getStartMonth(), calendar.getStartDay(), staff.getWeekdayStaffs());
            return;
        }
        if(calendar.getStartMonth() == 2 ){
            calendar.print28Calendar(calendar.getStartMonth(), calendar.getStartDay(), staff.getWeekdayStaffs());
            return;
        }
        calendar.print31Calendar(calendar.getStartMonth(), calendar.getStartDay(), staff.getWeekdayStaffs());
    }

}
