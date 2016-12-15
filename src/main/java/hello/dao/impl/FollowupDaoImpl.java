package hello.dao.impl;

import hello.dao.FollowupMapper;
import hello.domain.FollowupDomain;
import org.springframework.stereotype.Repository;

/**
 * Created by guojing on 2016/12/14.
 */
@Repository
public class FollowupDaoImpl implements FollowupMapper{
    @Override
    public FollowupDomain find(Long id) {
        FollowupDomain f = new FollowupDomain();
        f.setCodex(10001);
        f.setContent("this is in dao impl");
        return f;
    }
}
