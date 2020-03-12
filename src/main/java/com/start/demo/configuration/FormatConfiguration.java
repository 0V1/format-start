package com.start.demo.configuration;

import com.alibaba.fastjson.JSON;
import com.start.demo.format.FormatProcessor;
import com.start.demo.format.JsonFormat;
import com.start.demo.format.StringFormat;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

/**
 * @author qinfeng
 * @date 2020/3/12
 */
@Configuration
public class FormatConfiguration {

    /**
     * 条件注解，当主项目中有JSON这个类的时候则加载该bean
     *
     * @return
     * @Primary 标注在接口有多个实现类的bean时，某一个bean作为首选bean
     */
    @ConditionalOnClass(name = "com.alibaba.fastjson.JSON")
    @Bean
    @Primary
    public FormatProcessor jsonFormat() {

        return new JsonFormat();
    }

    /**
     * 条件注解，当主项目中没有指定类时则加载该bean
     *
     * @return
     */
    @ConditionalOnMissingClass("com.alibaba.fastjson.JSON")
    @Bean
    public FormatProcessor stringFormat() {

        return new StringFormat();
    }

}
