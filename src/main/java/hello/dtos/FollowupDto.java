package hello.dtos;

/**
 * Created by guojing on 2016/12/13.
 */

public class FollowupDto {

    private final long id;
    private final String content;

    public FollowupDto(long id, String content) {
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
