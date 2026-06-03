package com.school.xiaohashu.count.biz.service;



import com.school.framework.common.response.Response;
import com.school.xiaohashu.count.dto.FindNoteCountsByIdRspDTO;

import java.util.List;

/**
 * @author: 犬小哈
 * @date: 2024/4/7 15:41
 * @version: v1.0.0
 * @description: 笔记计数业务
 **/
public interface NoteCountService {

    /**
     * 批量查询笔记计数
     * @param findNoteCountsByIdsReqDTO
     * @return
     */
    Response<List<FindNoteCountsByIdRspDTO>> findNotesCountData(com.school.xiaohashu.count.dto.FindNoteCountsByIdsReqDTO findNoteCountsByIdsReqDTO);
}
