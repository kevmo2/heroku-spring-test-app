package industries.kvmo.services.dto;

/**
 *
 */
public class PostRequest {

    private long id;
    private String content;

    public PostRequest(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }

    //dummy constructor
    public PostRequest() {
    }
}
