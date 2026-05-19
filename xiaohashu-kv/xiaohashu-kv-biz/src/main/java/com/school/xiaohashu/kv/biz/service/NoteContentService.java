package com.school.xiaohashu.kv.biz.service;

import com.school.framework.common.response.Response;
import com.school.xiaohashu.kv.dto.req.DeleteNoteContentReqDTO;
import com.school.xiaohashu.kv.dto.req.FindNoteContentReqDTO;
import com.school.xiaohashu.kv.dto.resp.FindNoteContentRspDTO;
import com.school.xiaohashu.kv.dto.req.AddNoteContentReqDTO;

public interface NoteContentService {

    /**
     * 添加笔记内容
     *
     * @param addNoteContentReqDTO
     * @return
     */
    Response<?> addNoteContent(AddNoteContentReqDTO addNoteContentReqDTO);

    /**
     * 查询笔记内容
     *
     * @param findNoteContentReqDTO
     * @return
     */
    Response<FindNoteContentRspDTO> findNoteContent(FindNoteContentReqDTO findNoteContentReqDTO);
    /**
     * 删除笔记内容
     *
     * @param deleteNoteContentReqDTO
     * @return
     */
    Response<?> deleteNoteContent(DeleteNoteContentReqDTO deleteNoteContentReqDTO);
}