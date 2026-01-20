package n1exercise2;

public class Task {

    private Level level;

    public Task(Level level) {
        this.level = level;
    }

    public void recomendedBook() {
        switch (this.level) {
            case LOW:
                System.out.println("For initial level you can read \"The little Prince\" from \"Antoine de Saint Exupery\"");
                break;
            case MEDIUM:
                System.out.println("For medium level you can read \"Mistborn\" from \"Brandon Sanderson\"");
                break;
            case HIGH:
                System.out.println("For advanced level you can read \"The Silmarillion\" from \"Tolkien\"");
                break;
        }
    }
}
