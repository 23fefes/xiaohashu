package com.school.xiaohashu.kv.biz.service;

import com.school.framework.common.response.Response;
import com.school.xiaohashu.kv.dto.req.BatchAddCommentContentReqDTO;
import com.school.xiaohashu.kv.dto.req.BatchFindCommentContentReqDTO;

public interface CommentContentService {


    /**
     * 批量添加评论内容
     * @param batchAddCommentContentReqDTO
     * @return
     */
    Response<?> batchAddCommentContent(BatchAddCommentContentReqDTO batchAddCommentContentReqDTO);
    /**
     * 批量查询评论内容
     * @param batchFindCommentContentReqDTO
     * @return
     */
    Response<?> batchFindCommentContent(BatchFindCommentContentReqDTO batchFindCommentContentReqDTO);
}
