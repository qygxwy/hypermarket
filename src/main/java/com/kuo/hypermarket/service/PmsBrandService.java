package com.kuo.hypermarket.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.kuo.hypermarket.entity.PmsBrand;

import java.util.List;

/**
 * <p>
 * 品牌表 服务类
 * </p>
 *
 * @author qygxwy
 * @since 2020-05-05
 */
public interface PmsBrandService extends IService<PmsBrand> {

    /**
     * 分页查询品牌
     */
    List<PmsBrand> listBrand(String keyword, int pageNum, int pageSize);

    /**
     * 修改显示状态
     */
    int updateShowStatus(List<Long> ids, Integer showStatus);

    /**
     * 修改厂家制造商状态
     */
    int updateFactoryStatus(List<Long> ids, Integer factoryStatus);
}
