public enum Constants {
    FIRST_NAME("Florin"),
    LAST_NAME("Bogdan"),
    ZIP_CODE("10010");
    private String value;

    Constants(String val) {
        this.value = val;
    }

    public String getValue() {
        return value;
    }
}
