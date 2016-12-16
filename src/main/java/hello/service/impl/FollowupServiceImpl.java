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
    public String getById(Long id) {
        FollowupDomain followupDomain = followupMapper.find(id);
        if (followupDomain != null) {
            return followupDomain.getContent();
        } else {
            return "followup domain not found";
        }
    }
}
