package com.kuo.hypermarket.service.impl;

import com.kuo.hypermarket.mbg.mapper.PmsBrandMapper;
import com.kuo.hypermarket.mbg.model.PmsBrand;
import com.kuo.hypermarket.mbg.model.PmsBrandExample;
import com.kuo.hypermarket.service.PmsBrandService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wangfangfang
 * @Title: PmsBrandServiceImpl
 * @Description: PmsBrandService实现类
 * @date 2020/4/254:33 下午
 * @since 1.8
 */
@Service
public class PmsBrandServiceImpl implements PmsBrandService {

    @Autowired
    private PmsBrandMapper pmsBrandMapper;
    /**
     * 获取所有品牌
     *
     * @return 结果
     */
    @Override
    public List<PmsBrand> listAllBrand() {
        return new ArrayList<>();
    }

    /**
     * 创建品牌
     *
     * @param brand 品牌
     * @return 结果
     */
    @Override
    public int createBrand(PmsBrand brand) {
        return 0;
    }

    /**
     * 更新品牌
     *
     * @param id    品牌ID
     * @param brand 品牌信息
     * @return 结果
     */
    @Override
    public int updateBrand(Long id, PmsBrand brand) {
        return 0;
    }

    /**
     * 删除品牌
     *
     * @param id 品牌ID
     * @return 结果
     */
    @Override
    public int deleteBrand(Long id) {
        return 0;
    }

    /**
     * 分页查询品牌
     *
     * @param pageNum  第几页
     * @param pageSize 每页个数
     * @return 结果
     */
    @Override
    public List<PmsBrand> listBrand(int pageNum, int pageSize) {
        return null;
    }

    /**
     * 获取品牌
     *
     * @param id 品牌ID
     * @return 结果
     */
    @Override
    public PmsBrand getBrand(Long id) {
        return null;
    }
}