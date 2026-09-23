package Enum;

public enum Transaction {
    SUCCESS,
    FAILED,
    PENDING,
}


enum Level {
    LOW("Low level"),
    MEDIUM("Medium Level");


    private String description;


    private Level(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }
}
