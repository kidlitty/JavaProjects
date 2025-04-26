public class Task {

    private String title;
    private String description;
    private boolean isCompleted;

    public Task (String title, String description) {
        this.title = title;
        this.description = description;
        this.isCompleted = false;
    }

    public String getTitle () {
        return title;
    }
    public String getDescription () {
        return description;
    }
    public boolean isCompleted () {
        return isCompleted;
    }

    @Override
    public String toString() {
        String format = String.format("Title: %s | Description: %s | Status: %s", title, description, (isCompleted ? "Completed" : "Pending"));
        return format;
    }

}
