package hello.service.impl;

import hello.dao.FollowupMapper;
import hello.domain.FollowupDomain;
import hello.service.FollowupService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * Created by guojing on 2016/12/14.
 */
@Service
public class FollowupServiceImpl implements FollowupService {
    @Resource
    private FollowupMapper followupMapper;

    @Override
    public FollowupDomain getById(Long id) {
        FollowupDomain followupDomain = followupMapper.find(id);
        return followupDomain;
    }
}
