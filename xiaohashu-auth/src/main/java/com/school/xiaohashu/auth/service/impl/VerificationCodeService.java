package com.school.xiaohashu.auth.service.impl;

import com.school.framework.common.response.Response;
import com.school.xiaohashu.auth.model.vo.verificationcode.SendVerificationCodeReqVO;

public interface VerificationCodeService {
    /**
     * 发送短信验证码
     *
     * @param sendVerificationCodeReqVO
     * @return
     */
    Response<?> send(SendVerificationCodeReqVO sendVerificationCodeReqVO);
}
