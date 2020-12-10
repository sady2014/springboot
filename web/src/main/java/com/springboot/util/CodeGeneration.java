package com.springboot.util;

import com.baomidou.mybatisplus.annotation.DbType;
import com.baomidou.mybatisplus.annotation.FieldFill;
import com.baomidou.mybatisplus.core.toolkit.StringPool;
import com.baomidou.mybatisplus.generator.AutoGenerator;
import com.baomidou.mybatisplus.generator.InjectionConfig;
import com.baomidou.mybatisplus.generator.config.*;
import com.baomidou.mybatisplus.generator.config.po.TableFill;
import com.baomidou.mybatisplus.generator.config.po.TableInfo;
import com.baomidou.mybatisplus.generator.config.rules.DateType;
import com.baomidou.mybatisplus.generator.config.rules.NamingStrategy;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Mugua
 * @date 2020年12月10日
 */
public class CodeGeneration{
    public static void main(String[] args) {
        // 代码生成器
        AutoGenerator mpg = new AutoGenerator();
        // 全局配置
        GlobalConfig gc = new GlobalConfig();
        //当前路径
        String projectPath = System.getProperty("user.dir");
        System.out.println(projectPath);
        //输出路径
        gc.setOutputDir(projectPath + "/web/src/main/java");
        //设置作者
        gc.setAuthor("Mugua");
        //生成代码后，是否打开文件夹
        gc.setOpen(false);
        gc.setBaseResultMap(true);
        gc.setBaseColumnList(true);
        //是否覆盖原来代码，个人建议设置为false,别覆盖，危险系数太高
        gc.setFileOverride(false);
        //去掉service的I前缀,一般只需要设置service就行
        gc.setServiceName("%sService");
        //日期格式
        gc.setDateType(DateType.ONLY_DATE);
        // 实体属性 Swagger2 注解,实体类上会增加注释
        gc.setSwagger2(true);
        mpg.setGlobalConfig(gc);

        // 数据源配置
        DataSourceConfig dsc = new DataSourceConfig();
        dsc.setUrl("jdbc:mysql://ssr.sady.vip:3306/mybatis?useUnicode=true&characterEncoding=utf8");
        // dsc.setSchemaName("public");
        dsc.setDriverName("com.mysql.cj.jdbc.Driver");
        dsc.setUsername("root");
        dsc.setPassword("123456");
        //指定数据库的类型
        dsc.setDbType(DbType.MYSQL);
        mpg.setDataSource(dsc);
        // 包配置
        PackageConfig pc = new PackageConfig();
        //自定义包的路径
        pc.setParent("com.springboot");
        //模块名称  设置后,会生成com.cxyxs.test.module,里面存放之前设置的mapper,entity
        //pc.setModuleName("module");
        pc.setEntity("entity");
        pc.setMapper("mapper");
        pc.setService("service");
        pc.setController("controller");
        mpg.setPackageInfo(pc);
        // 策略配置
        StrategyConfig strategy = new StrategyConfig();
        //设置映射的表名，可以设置多个表
        strategy.setInclude("userInfo");

        //表前缀设置  cxyxs_student
        //strategy.setTablePrefix(new String[]{"cxyxs_"});
        //包的命名规则，使用驼峰规则
        strategy.setNaming(NamingStrategy.underline_to_camel);
        //列的名称，使用驼峰规则
        strategy.setColumnNaming(NamingStrategy.underline_to_camel);
        //是否使用lombok
        strategy.setEntityLombokModel(true);
        //驼峰命名
        strategy.setRestControllerStyle(true);
        //逻辑删除,假删除会用到
        strategy.setLogicDeleteFieldName("is_delete");
        //自定义配置
        InjectionConfig cfg = new InjectionConfig() {
            @Override
            public void initMap() {
                // to do nothing
            }
        };
//        String templatePath = "/templates/mapper.xml.ftl";
        // 如果模板引擎是 velocity
         String templatePath = "/templates/mapper.xml.vm";

        // 自定义输出配置
        List<FileOutConfig> focList = new ArrayList<>();
        // 自定义配置会被优先输出
        focList.add(new FileOutConfig(templatePath) {
            @Override
            public String outputFile(TableInfo tableInfo) {
                // 自定义输出文件名 ， 如果你 Entity 设置了前后缀、此处注意 xml 的名称会跟着发生变化！！
                return projectPath + "/web/src/main/resources/mapper/" + pc.getModuleName()
                        + "/" + tableInfo.getEntityName() + "Mapper" + StringPool.DOT_XML;
            }
        });
        cfg.setFileOutConfigList(focList);
        mpg.setCfg(cfg);


        //自动填充字段,在项目开发过程中,例如创建时间，修改时间,每次，都需要我们来指定，太麻烦了,设置为自动填充规则，就不需要我们赋值咯
//        TableFill fillInsert = new TableFill("create_time", FieldFill.INSERT);
//        TableFill fillUpdate= new TableFill("update_time", FieldFill.UPDATE);
//        List fillLists = new ArrayList();
//        fillLists.add(fillInsert);
//        fillLists.add(fillUpdate);
//        strategy.setTableFillList(fillLists);
        //乐观锁
        //strategy.setVersionFieldName("version");
        mpg.setStrategy(strategy);
//执行
        mpg.execute();
    }
}