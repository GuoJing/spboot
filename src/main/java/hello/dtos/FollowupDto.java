package hello.dtos;

import hello.domain.FollowupDomain;

/**
 * Created by guojing on 2016/12/13.
 */

public class FollowupDto {

    private final FollowupDomain followup;

    public FollowupDto(FollowupDomain followup) {
        this.followup = followup;
    }

    public Long getId(){
        return followup.getId();
    }

    public String getContent(){
        return followup.getContent();
    }

    public int getCodex(){
        return followup.getCodex();
    }
}
