package industries.kvmo.services.dto;

/**
 *
 */
public class PostResponse {

    private long id;
    private String content;

    public PostResponse(long id, String content) {
        this.id = id;
        this.content = content;
    }

    public long getId() {
        return id;
    }

    public String getContent() {
        return content;
    }
}
