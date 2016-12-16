package hello.service;

import hello.domain.FollowupDomain;

/**
 * Created by guojing on 2016/12/14.
 */
public interface FollowupService {
    FollowupDomain getById(Long id);
}
