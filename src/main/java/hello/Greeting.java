package hello;

public class Greeting {

    private final long id;
    private final String message;

    public Greeting(long id, String content) {
        this.id = id;
        this.message = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return message;
    }
}
