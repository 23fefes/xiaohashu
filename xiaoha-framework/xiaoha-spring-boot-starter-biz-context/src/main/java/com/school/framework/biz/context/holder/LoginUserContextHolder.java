package com.school.framework.biz.context.holder;

import com.alibaba.ttl.TransmittableThreadLocal;
import com.school.framework.common.contant.GlobalConstants;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class LoginUserContextHolder {
private static final ThreadLocal<Map<String, Object>> LOGIN_USER_CONTEXT_THREAD_LOCAL
        = TransmittableThreadLocal.withInitial(HashMap::new);


/**
 * 设置用户 ID
 *
 * @param value
 */
public static void setUserId(Object value) {
    LOGIN_USER_CONTEXT_THREAD_LOCAL.get().put(GlobalConstants.USER_ID, value);
}

/**
 * 获取用户 ID
 *
 * @return
 */
public static Long getUserId() {
    Object value = LOGIN_USER_CONTEXT_THREAD_LOCAL.get().get(GlobalConstants.USER_ID);
    if (Objects.isNull(value)) {
        return null;
    }
    return Long.valueOf(value.toString());
}

/**
 * 删除 ThreadLocal
 */
public static void remove() {
    LOGIN_USER_CONTEXT_THREAD_LOCAL.remove();
}

}