package industries.kvmo.services.dto;

/**
 *
 */
public class HiWorld {

    private long id;
    private String greeting;

    public HiWorld(long id, String greeting) {
        this.id = id;
        this.greeting = greeting;
    }

    public long getId() {
        return id;
    }

    public String getGreeting() {
        return greeting;
    }
}
