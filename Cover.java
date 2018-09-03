package homework;

public enum Cover {
    SOFT("miękka"),
    HARD("twarda");

    private String type;

    Cover(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
