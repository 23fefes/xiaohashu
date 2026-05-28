package com.school.xiaohashu.comment.biz.controller;

import com.school.framework.biz.operationlog.aspect.ApiOperationLog;
import com.school.framework.common.response.PageResponse;
import com.school.framework.common.response.Response;
import com.school.xiaohashu.comment.biz.model.vo.FindCommentItemRspVO;
import com.school.xiaohashu.comment.biz.model.vo.FindCommentPageListReqVO;
import com.school.xiaohashu.comment.biz.model.vo.PublishCommentReqVO;
import com.school.xiaohashu.comment.biz.service.CommentService;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/comment")
@Slf4j
public class CommentController {

    @Resource
    private CommentService commentService;

    @PostMapping("/publish")
    @ApiOperationLog(description = "发布评论")
    public Response<?> publishComment(@Validated @RequestBody PublishCommentReqVO publishCommentReqVO) {
        return commentService.publishComment(publishCommentReqVO);
    }
    @PostMapping("/list")
    @ApiOperationLog(description = "评论分页查询")
    public PageResponse<FindCommentItemRspVO> findCommentPageList(@Validated @RequestBody FindCommentPageListReqVO findCommentPageListReqVO) {
        return commentService.findCommentPageList(findCommentPageListReqVO);
    }

}