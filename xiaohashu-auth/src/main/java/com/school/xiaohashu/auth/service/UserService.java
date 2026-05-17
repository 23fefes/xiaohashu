package com.school.xiaohashu.auth.service;

import com.school.framework.common.response.Response;
import com.school.xiaohashu.auth.model.vo.user.UserLoginReqVO;

public interface UserService {

    /**
     * 登录与注册
     * @param userLoginReqVO
     * @return
     */
    Response<String> loginAndRegister(UserLoginReqVO userLoginReqVO);
    /**
     * 退出登录
     * @return
     */
    Response<?> logout(Long userId);
}
