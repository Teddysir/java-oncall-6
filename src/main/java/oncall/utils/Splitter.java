package oncall.utils;

import java.util.Arrays;
import java.util.List;

public class Splitter {

    public static String[] getSplitMonthAndDay(String rawInput) {
        return rawInput.split(",");
    }

    public static List<String> getSplitStaffsComma(String rawInput) {
        return Arrays.stream(rawInput.split(","))
                .map(String::trim)
                .toList();
    }
}
