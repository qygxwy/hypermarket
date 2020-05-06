package com.kuo.hypermarket.service.impl;

import com.kuo.hypermarket.entity.OmsOrderItem;
import com.kuo.hypermarket.mapper.OmsOrderItemMapper;
import com.kuo.hypermarket.service.OmsOrderItemService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 订单中所包含的商品 服务实现类
 * </p>
 *
 * @author qygxwy
 * @since 2020-05-05
 */
@Service
public class OmsOrderItemServiceImpl extends ServiceImpl<OmsOrderItemMapper, OmsOrderItem> implements OmsOrderItemService {

}
