package com.school.xiaohashu.user.relation.biz.service;

import com.school.framework.common.response.Response;
import com.school.xiaohashu.user.relation.biz.model.vo.FollowUserReqVO;

public interface RelationService {

    /**
     * 关注用户
     * @param followUserReqVO
     * @return
     */
    Response<?> follow(FollowUserReqVO followUserReqVO);

}