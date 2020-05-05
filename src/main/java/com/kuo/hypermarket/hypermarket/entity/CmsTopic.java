package com.kuo.hypermarket.hypermarket.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import java.util.Date;
import com.baomidou.mybatisplus.annotation.Version;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.TableField;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 话题表
 * </p>
 *
 * @author qygxwy
 * @since 2020-05-05
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="CmsTopic对象", description="话题表")
public class CmsTopic implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    private Long categoryId;

    private String name;

    @TableField(fill = FieldFill.INSERT)
    private Date createTime;

    private Date startTime;

    private Date endTime;

    @ApiModelProperty(value = "参与人数")
    private Integer attendCount;

    @ApiModelProperty(value = "关注人数")
    private Integer attentionCount;

    private Integer readCount;

    @ApiModelProperty(value = "奖品名称")
    private String awardName;

    @ApiModelProperty(value = "参与方式")
    private String attendType;

    @ApiModelProperty(value = "话题内容")
    private String content;


}
