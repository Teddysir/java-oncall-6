package oncall.constants;

public enum ErrorMessageType {

    DUPLICATE_NICKNAME_ERROR("[ERROR] 유효하지 않은 입력 값입니다. 다시 입력해 주세요."),
    INVALID_NICKNAME_LENGTH_ERROR("[ERROR] 유효하지 않은 입력 값입니다. 다시 입력해 주세요."),
    MINIMUM_STAFFS_ERROR("[ERROR] 유효하지 않은 입력 값입니다. 다시 입력해 주세요."),
    MAXIMUM_STAFFS_ERROR("[ERROR] 유효하지 않은 입력 값입니다. 다시 입력해 주세요."),
    INVALID_STAFF_INPUT_ERROR("[ERROR] 유효하지 않은 입력 값입니다. 다시 입력해 주세요."),

    INVALID_START_MONTH_FORMAT("[ERROR] 유효하지 않은 입력 값입니다. 다시 입력해 주세요."),
    INVALID_START_DAY_FORMAT("[ERROR] 유효하지 않은 입력 값입니다. 다시 입력해 주세요.");

    private final String message;

    ErrorMessageType(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

}
