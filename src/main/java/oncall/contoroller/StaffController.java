package oncall.contoroller;

import oncall.utils.ServiceValidation;
import oncall.utils.Splitter;
import oncall.view.InputView;

import java.util.List;

public class StaffController {

    public void start() {
        startMonthAndDay();
        employWeekdayStaffs();
        employHolidayStaffs();
    }

    private void startMonthAndDay() {
        String rawMonthAndDay = InputView.inputMessageMonthAndDay();

        ServiceValidation.checkedRawInput(rawMonthAndDay);

        String[] splitRawMonthAndDay = Splitter.getSplitMonthAndDay(rawMonthAndDay);

        int startMonth = ServiceValidation.checkedStartMonth(splitRawMonthAndDay[0].trim()); // ex) 12
        ServiceValidation.checkedStartDay(splitRawMonthAndDay[1].trim());
        String startDay = splitRawMonthAndDay[1].trim(); // ex) 월

    }

    private void employWeekdayStaffs() {
        String rawWeekdayStaffs = InputView.inputMessageWeekdayStaffs();

        ServiceValidation.checkedRawInput(rawWeekdayStaffs);

        List<String> weekdayStaffs = Splitter.getSplitStaffsComma(rawWeekdayStaffs.trim()); // ex) [성훈, 수아, 동균, 효성]

        ServiceValidation.checkedDuplicateNickname(rawWeekdayStaffs, weekdayStaffs);
        ServiceValidation.checkedNicknameLength(weekdayStaffs);
        ServiceValidation.checkedMinimumStaffs(weekdayStaffs);
        ServiceValidation.checkedMaximumStaffs(weekdayStaffs);
    }

    private void employHolidayStaffs() {
        String rawHolidayStaffs = InputView.inputMessageHolidayStaffs();

        ServiceValidation.checkedRawInput(rawHolidayStaffs);

        List<String> holidayStaffs = Splitter.getSplitStaffsComma(rawHolidayStaffs.trim());

        ServiceValidation.checkedDuplicateNickname(rawHolidayStaffs, holidayStaffs);
        ServiceValidation.checkedNicknameLength(holidayStaffs);
        ServiceValidation.checkedMinimumStaffs(holidayStaffs);
        ServiceValidation.checkedMaximumStaffs(holidayStaffs);
    }

}
