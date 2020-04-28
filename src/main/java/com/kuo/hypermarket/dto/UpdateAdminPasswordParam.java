package com.kuo.hypermarket.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotEmpty;

/**
 * @author wangfangfang
 * @Title: UpdateAdminPasswordParam
 * @Description: 修改用户名密码参数
 * @date 2020/4/2710:43 下午
 * @since 1.8
 */
@Data
public class UpdateAdminPasswordParam {
    @ApiModelProperty(value = "用户名", required = true)
    @NotEmpty(message = "用户名不能为空")
    private String username;
    @ApiModelProperty(value = "旧密码", required = true)
    @NotEmpty(message = "旧密码不能为空")
    private String oldPassword;
    @ApiModelProperty(value = "新密码", required = true)
    @NotEmpty(message = "新密码不能为空")
    private String newPassword;
}