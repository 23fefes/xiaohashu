package com.school.xiaohashu.kv.api;

import com.school.framework.common.response.Response;
import com.school.xiaohashu.kv.dto.req.DeleteNoteContentReqDTO;
import com.school.xiaohashu.kv.dto.req.FindNoteContentReqDTO;
import com.school.xiaohashu.kv.dto.req.AddNoteContentReqDTO;
import com.school.xiaohashu.kv.constant.ApiConstants;
import com.school.xiaohashu.kv.dto.resp.FindNoteContentRspDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@FeignClient(name = ApiConstants.SERVICE_NAME)
public interface KeyValueFeignApi {

    String PREFIX = "/kv";

    @PostMapping(value = PREFIX + "/note/content/add")
    Response<?> addNoteContent(@RequestBody AddNoteContentReqDTO addNoteContentReqDTO);

    @PostMapping(value = PREFIX + "/note/content/find")
    Response<FindNoteContentRspDTO> findNoteContent(@RequestBody FindNoteContentReqDTO findNoteContentReqDTO);

    @PostMapping(value = PREFIX + "/note/content/delete")
    Response<?> deleteNoteContent(@RequestBody DeleteNoteContentReqDTO deleteNoteContentReqDTO);
}
