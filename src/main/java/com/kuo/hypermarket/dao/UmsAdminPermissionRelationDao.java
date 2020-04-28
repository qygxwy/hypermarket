package com.kuo.hypermarket.dao;

import com.kuo.hypermarket.mbg.model.UmsAdminPermissionRelation;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * 用户权限自定义Dao
 *
 * @author macro
 * @date 2020/04/27
 */
public interface UmsAdminPermissionRelationDao {
    int insertList(@Param("list") List<UmsAdminPermissionRelation> list);
}
