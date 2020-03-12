package com.start.demo.annotation;

import com.start.demo.configuration.FormatTemplateConfiguration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @author qinfeng
 * @date 2020/3/12
 */
@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(FormatTemplateConfiguration.class)
public @interface EnableFormat {
}
