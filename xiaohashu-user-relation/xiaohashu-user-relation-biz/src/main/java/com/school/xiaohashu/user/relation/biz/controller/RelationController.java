package com.school.xiaohashu.user.relation.biz.controller;

import com.school.framework.biz.operationlog.aspect.ApiOperationLog;
import com.school.framework.common.response.PageResponse;
import com.school.framework.common.response.Response;
import com.school.xiaohashu.user.relation.biz.model.vo.FindFansListReqVO;
import com.school.xiaohashu.user.relation.biz.model.vo.FindFansUserRspVO;
import com.school.xiaohashu.user.relation.biz.model.vo.FollowUserReqVO;
import com.school.xiaohashu.user.relation.biz.model.vo.UnfollowUserReqVO;
import com.school.xiaohashu.user.relation.biz.service.RelationService;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping()
@Slf4j
public class RelationController {

    @Resource
    private RelationService relationService;

    @PostMapping("/follow")
    @ApiOperationLog(description = "关注用户")
    public Response<?> follow(@Validated @RequestBody FollowUserReqVO followUserReqVO) {
        return relationService.follow(followUserReqVO);
    }

    @PostMapping("/unfollow")
    @ApiOperationLog(description = "取关用户")
    public Response<?> unfollow(@Validated @RequestBody UnfollowUserReqVO unfollowUserReqVO) {
        return relationService.unfollow(unfollowUserReqVO);
    }
    @PostMapping("/fans/list")
    @ApiOperationLog(description = "查询用户粉丝列表")
    public PageResponse<FindFansUserRspVO> findFansList(@Validated @RequestBody FindFansListReqVO findFansListReqVO) {
        return relationService.findFansList(findFansListReqVO);
    }
}