package com.school.xiaohashu.user.biz.service;

import com.school.framework.common.response.Response;
import com.school.xiaohashu.user.biz.model.vo.UpdateUserInfoReqVO;
import com.school.xiaohashu.user.dto.req.FindUserByPhoneReqDTO;
import com.school.xiaohashu.user.dto.req.RegisterUserReqDTO;
import com.school.xiaohashu.user.dto.req.UpdateUserPasswordReqDTO;
import com.school.xiaohashu.user.dto.resp.FindUserByPhoneRspDTO;


public interface UserService {

    /**
     * 更新用户信息
     *
     * @param updateUserInfoReqVO
     * @return
     */
    Response<?> updateUserInfo(UpdateUserInfoReqVO updateUserInfoReqVO);
    /**
     * 用户注册
     *
     * @param registerUserReqDTO
     * @return
     */
    Response<Long> register(RegisterUserReqDTO registerUserReqDTO);
    /**
     * 根据手机号查询用户信息
     *
     * @param findUserByPhoneReqDTO
     * @return
     */
    Response<FindUserByPhoneRspDTO> findByPhone(FindUserByPhoneReqDTO findUserByPhoneReqDTO);
    /**
     * 更新密码
     *
     * @param updateUserPasswordReqDTO
     * @return
     */
    Response<?> updatePassword(UpdateUserPasswordReqDTO updateUserPasswordReqDTO);
}
