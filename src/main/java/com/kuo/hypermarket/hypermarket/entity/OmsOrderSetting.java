package com.kuo.hypermarket.hypermarket.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.Version;
import com.baomidou.mybatisplus.annotation.TableId;
import java.io.Serializable;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

/**
 * <p>
 * 订单设置表
 * </p>
 *
 * @author qygxwy
 * @since 2020-05-05
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="OmsOrderSetting对象", description="订单设置表")
public class OmsOrderSetting implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    @ApiModelProperty(value = "秒杀订单超时关闭时间(分)")
    private Integer flashOrderOvertime;

    @ApiModelProperty(value = "正常订单超时时间(分)")
    private Integer normalOrderOvertime;

    @ApiModelProperty(value = "发货后自动确认收货时间（天）")
    private Integer confirmOvertime;

    @ApiModelProperty(value = "自动完成交易时间，不能申请售后（天）")
    private Integer finishOvertime;

    @ApiModelProperty(value = "订单完成后自动好评时间（天）")
    private Integer commentOvertime;


}
