package com.kuo.hypermarket.hypermarket.service.impl;

import com.kuo.hypermarket.hypermarket.entity.PmsProductCategoryAttributeRelation;
import com.kuo.hypermarket.hypermarket.mapper.PmsProductCategoryAttributeRelationMapper;
import com.kuo.hypermarket.hypermarket.service.PmsProductCategoryAttributeRelationService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 产品的分类和属性的关系表，用于设置分类筛选条件（只支持一级分类） 服务实现类
 * </p>
 *
 * @author qygxwy
 * @since 2020-05-05
 */
@Service
public class PmsProductCategoryAttributeRelationServiceImpl extends ServiceImpl<PmsProductCategoryAttributeRelationMapper, PmsProductCategoryAttributeRelation> implements PmsProductCategoryAttributeRelationService {

}
