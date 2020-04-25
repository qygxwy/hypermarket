package com.kuo.hypermarket.service;

import com.kuo.hypermarket.mbg.model.PmsBrand;

import java.util.List;

/**
 * @author wangfangfang
 */
public interface PmsBrandService {

    /**
     * 获取所有品牌
     * @return 结果
     */
    List<PmsBrand> listAllBrand();

    /**
     * 创建品牌
     * @param brand 品牌
     * @return 结果
     */
    int createBrand(PmsBrand brand);

    /**
     *  更新品牌
     * @param id 品牌ID
     * @param brand 品牌信息
     * @return 结果
     */
    int updateBrand(Long id, PmsBrand brand);

    /**
     *  删除品牌
     * @param id 品牌ID
     * @return 结果
     */
    int deleteBrand(Long id);

    /**
     * 分页查询品牌
     * @param pageNum 第几页
     * @param pageSize 每页个数
     * @return 结果
     */
    List<PmsBrand> listBrand(int pageNum, int pageSize);

    /**
     * 获取品牌
     * @param id 品牌ID
     * @return 结果
     */
    PmsBrand getBrand(Long id);
}
