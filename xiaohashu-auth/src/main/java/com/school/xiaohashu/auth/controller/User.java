package com.school.xiaohashu.auth.controller;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.school.framework.common.contant.DateConstants;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class User {
    /**
     * 昵称
     */
    private String nickName;

    /**
     * 创建时间
     */

    private LocalDateTime createTime;
}

