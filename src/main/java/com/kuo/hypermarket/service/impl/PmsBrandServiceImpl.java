package com.kuo.hypermarket.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.github.pagehelper.PageHelper;
import com.kuo.hypermarket.entity.PmsBrand;
import com.kuo.hypermarket.mapper.PmsBrandMapper;
import com.kuo.hypermarket.mapper.PmsProductMapper;
import com.kuo.hypermarket.service.PmsBrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * <p>
 * 品牌表 服务实现类
 * </p>
 *
 * @author qygxwy
 * @since 2020-05-05
 */
@Service
public class PmsBrandServiceImpl extends ServiceImpl<PmsBrandMapper, PmsBrand> implements PmsBrandService {
    @Autowired
    private PmsBrandMapper pmsBrandMapper;

    @Autowired
    private PmsProductMapper pmsProductMapper;

    /**
     * 分页查询品牌
     *
     * @param keyword
     * @param pageNum
     * @param pageSize
     */
    @Override
    public List<PmsBrand> listBrand(String keyword, int pageNum, int pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        QueryWrapper<PmsBrand> pmsBrandQueryWrapper = new QueryWrapper<>();
        pmsBrandQueryWrapper.orderByDesc("sort");

        if (!StringUtils.isEmpty(keyword)) {
            pmsBrandQueryWrapper.like("name","%" + keyword + "%");
        }
        return pmsBrandMapper.selectList(pmsBrandQueryWrapper);
    }

    /**
     * 获取品牌
     *
     * @param id
     */
//    @Override
    public PmsBrand getBrand(Long id) {
        return pmsBrandMapper.selectById(id);
    }

    /**
     * 修改显示状态
     *
     * @param ids
     * @param showStatus
     */
    @Override
    public int updateShowStatus(List<Long> ids, Integer showStatus) {
        return 0;
//        PmsBrand pmsBrand = new PmsBrand();
//        pmsBrand.setShowStatus(showStatus);
//        PmsBrandExample pmsBrandExample = new PmsBrandExample();
//        pmsBrandExample.createCriteria().andIdIn(ids);
//        return pmsBrandMapper.updateByExampleSelective(pmsBrand, pmsBrandExample);
    }

    /**
     * 修改厂家制造商状态
     *
     * @param ids
     * @param factoryStatus
     */
    @Override
    public int updateFactoryStatus(List<Long> ids, Integer factoryStatus) {
        return 0;
//        PmsBrand pmsBrand = new PmsBrand();
//        pmsBrand.setFactoryStatus(factoryStatus);
//        PmsBrandExample pmsBrandExample = new PmsBrandExample();
//        pmsBrandExample.createCriteria().andIdIn(ids);
//        return pmsBrandMapper.updateByExampleSelective(pmsBrand, pmsBrandExample);
    }

}
