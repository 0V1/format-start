package com.start.demo.configuration;

import com.start.demo.format.FormatProcessor;
import com.start.demo.format.FormatTemplate;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @author qinfeng
 * @date 2020/3/12
 */
@Configuration
@Import(FormatConfiguration.class)
@EnableConfigurationProperties(FormatProperties.class)
public class FormatTemplateConfiguration {

    @Bean
    public FormatTemplate formatTemplate(FormatProcessor formatProcessor, FormatProperties formatPreperties) {
        return new FormatTemplate(formatProcessor, formatPreperties);
    }
}
