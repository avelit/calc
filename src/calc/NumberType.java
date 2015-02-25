package calc;

public enum NumberType {
    ARABIAN, ROMEAN, HEX, BINARY;

    public String getString() {
        switch (this) {
        case ARABIAN:
            return "";
        case ROMEAN:
            return "(r)";
        case HEX:
            return "(16)";
        case BINARY:
            return "(2)";
        default:
            return "";
        }
    }
}
