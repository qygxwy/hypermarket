package com.kuo.hypermarket.controller;

import com.kuo.hypermarket.common.api.CommonResult;
import com.kuo.hypermarket.mbg.model.PmsBrand;
import com.kuo.hypermarket.service.PmsBrandService;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;


/**
 * @author wangfangfang
 * @Title: PmsBrandController
 * @Description: 品牌接口类
 * @date 2020/4/254:38 下午
 * @since 1.8
 */
@Controller
@RequestMapping("/brand")
public class PmsBrandController {
    @Autowired
    private PmsBrandService pmsBrandService;

    private static final Logger LOGGER = LoggerFactory.getLogger(PmsBrandController.class);

    @RequestMapping(value = "/listAll", method = RequestMethod.GET)
    @ResponseBody
    public CommonResult<List<PmsBrand>> getBrandList() {
        return CommonResult.success(pmsBrandService.listAllBrand());
    }
}