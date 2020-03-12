package com.start.demo.configuration;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author qinfeng
 * @date 2020/3/12
 */
@ConfigurationProperties(prefix = FormatProperties.FORMAT_PREFIX)
public class FormatProperties {

    public static final String FORMAT_PREFIX="demo.format";

    private String info;

    public String getInfo() {
        return info;
    }

    public void setInfo(String info) {
        this.info = info;
    }
}
