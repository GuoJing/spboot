package hello.service.impl;

import hello.service.FollowupService;
import org.springframework.stereotype.Service;

/**
 * Created by guojing on 2016/12/14.
 */
@Service
public class FollowupServiceImpl implements FollowupService {
    @Override
    public String getById(Long id) {
        return "this is in followup service impl";
    }
}
