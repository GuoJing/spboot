package hello.dao.impl;

import hello.dao.FollowupMapper;
import hello.domain.FollowupDomain;

/**
 * Created by guojing on 2016/12/14.
 */
public class FollowupDaoImpl implements FollowupMapper{
    @Override
    public FollowupDomain get(Long id) {
        FollowupDomain f = new FollowupDomain();
        f.setCodex(10001);
        return f;
    }
}
