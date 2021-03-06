package com.kuo.hypermarket.mbg.mapper;

import com.kuo.hypermarket.mbg.model.UmsMemberTag;
import com.kuo.hypermarket.mbg.model.UmsMemberTagExample;
import io.swagger.annotations.ApiModelProperty;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UmsMemberTagMapper {
    long countByExample(UmsMemberTagExample example);

    int deleteByExample(UmsMemberTagExample example);

    int deleteByPrimaryKey(Long id);

    int insert(UmsMemberTag record);

    int insertSelective(UmsMemberTag record);

    List<UmsMemberTag> selectByExample(UmsMemberTagExample example);

    UmsMemberTag selectByPrimaryKey(Long id);

    int updateByExampleSelective(@Param("record") UmsMemberTag record, @Param("example") UmsMemberTagExample example);

    int updateByExample(@Param("record") UmsMemberTag record, @Param("example") UmsMemberTagExample example);

    int updateByPrimaryKeySelective(UmsMemberTag record);

    int updateByPrimaryKey(UmsMemberTag record);
}