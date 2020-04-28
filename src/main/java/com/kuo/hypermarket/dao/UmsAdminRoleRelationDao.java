package com.kuo.hypermarket.dao;

import com.kuo.hypermarket.mbg.model.UmsAdminRoleRelation;
import com.kuo.hypermarket.mbg.model.UmsPermission;
import com.kuo.hypermarket.mbg.model.UmsResource;
import com.kuo.hypermarket.mbg.model.UmsRole;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @author wangfangfang
 * @Title: UmsAdminRoleRelationDao
 * @Description: 后台用户与角色管理自定义Dao
 * @date 2020/4/2710:49 下午
 * @since 1.8
 */
public interface UmsAdminRoleRelationDao {
    /**
     * 批量插入用户角色关系
     */
    int insertList(@Param("list") List<UmsAdminRoleRelation> adminRoleRelationList);

    /**
     * 获取用于所有角色
     */
    List<UmsRole> getRoleList(@Param("adminId") Long adminId);

    /**
     * 获取用户所有角色权限
     */
    List<UmsPermission> getRolePermissionList(@Param("adminId") Long adminId);

    /**
     * 获取用户所有权限(包括+-权限)
     */
    List<UmsPermission> getPermissionList(@Param("adminId") Long adminId);

    /**
     * 获取用户所有可访问资源
     */
    List<UmsResource> getResourceList(@Param("adminId") Long adminId);
}