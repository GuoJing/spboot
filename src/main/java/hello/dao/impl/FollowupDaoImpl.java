package hello.dao.impl;

import hello.dao.FollowupMapper;
import hello.domain.FollowupDomain;
import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

import javax.annotation.Resource;

/**
 * Created by guojing on 2016/12/14.
 */
@Repository
public class FollowupDaoImpl implements FollowupMapper{
    @Resource
    private SqlSession sqlSession;

    @Override
    public FollowupDomain find(Long id) {
        return sqlSession.selectOne("FollowupMapper.find", id);
    }
}
