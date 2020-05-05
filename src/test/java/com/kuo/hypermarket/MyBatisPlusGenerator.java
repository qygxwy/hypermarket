package com.kuo.hypermarket;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.config.DataSourceConfig;
import com.baomidou.mybatisplus.generator.config.GlobalConfig;
import com.baomidou.mybatisplus.generator.config.PackageConfig;
import com.baomidou.mybatisplus.generator.config.StrategyConfig;
import com.baomidou.mybatisplus.generator.config.po.TableFill;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;

import java.util.ArrayList;

/**
 * @author wangfangfang
 * @Title: MyBatisPlusGenerator
 * @Description: MyBatisPlus自动生成器
 * @date 2020/5/59:50 下午
 * @since 1.8
 */
public class MyBatisPlusGenerator {
    public static void main(String[] args) {
        /*
        构建代码自动生成器对象
         */
        AutoGenerator autoGenerator = new AutoGenerator();

        /*
        1. 全局配置
         */
        GlobalConfig globalConfig = new GlobalConfig();
        String projectPath = System.getProperty("user.dir");
        globalConfig.setOutputDir(projectPath+"/src/main/java");
        globalConfig.setAuthor("qygxwy");
        globalConfig.setOpen(true);
        globalConfig.setFileOverride(true);
        globalConfig.setServiceName("%sService");
        globalConfig.setIdType(IdType.ASSIGN_ID);
        globalConfig.setDateType(DateType.ONLY_DATE);
        globalConfig.setSwagger2(true);
        autoGenerator.setGlobalConfig(globalConfig);

        /*
        2. 设置数据源
         */
        DataSourceConfig dataSourceConfig = new DataSourceConfig();
        dataSourceConfig.setUrl("jdbc:mysql://localhost:3306/mall?useUnicode=true&characterEncoding=utf-8&serverTimeZone=Asia/Shanghai");
        dataSourceConfig.setDriverName("com.mysql.cj.jdbc.Driver");
        dataSourceConfig.setUsername("root");
        dataSourceConfig.setPassword("hk123465");
        dataSourceConfig.setDbType(DbType.MYSQL);
        autoGenerator.setDataSource(dataSourceConfig);

        /*
        3. 包的配置
         */
        PackageConfig packageConfig = new PackageConfig();
        packageConfig.setModuleName("hypermarket");
        packageConfig.setParent("com.kuo.hypermarket");
        packageConfig.setController("controller");
        packageConfig.setEntity("entity");
        packageConfig.setMapper("mapper");
        packageConfig.setService("service");
        autoGenerator.setPackageInfo(packageConfig);

        /*
        4. 策略配置
         */
        StrategyConfig strategyConfig = new StrategyConfig();
        strategyConfig.setNaming(NamingStrategy.underline_to_camel);
        strategyConfig.setColumnNaming(NamingStrategy.underline_to_camel);
        strategyConfig.setEntityLombokModel(true);
        strategyConfig.setRestControllerStyle(true);
        TableFill createTime = new TableFill("create_time", FieldFill.INSERT);
        ArrayList<TableFill> tableFills = new ArrayList<>();
        tableFills.add(createTime);
        strategyConfig.setTableFillList(tableFills);
        strategyConfig.setVersionFieldName("version");
//        strategyConfig.setControllerMappingHyphenStyle(true);
        autoGenerator.setStrategy(strategyConfig);

        autoGenerator.execute();
    }
}