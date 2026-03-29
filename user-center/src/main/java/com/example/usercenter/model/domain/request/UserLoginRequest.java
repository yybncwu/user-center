package com.example.usercenter.model.domain.request;

import lombok.Data;

import java.io.Serial;
import java.io.Serializable;

/**
 * 用户注册请求体
 * @author YangYingBin
 * @date 2026/3/14&&8:54
 **/
@Data
public class UserLoginRequest implements Serializable {

    @Serial
    private static final long serialVersionUID = -543286974259314538L;

    private  String userAccount;

    private  String userPassword;

}
