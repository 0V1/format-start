package com.start.demo.format;

/**
 * @author qinfeng
 * @date 2020/3/12
 */
public interface FormatProcessor {

    /**
     * 格式化方法
     * @param t t
     * @param <T> t
     * @return String
     */
    <T> String format(T t);
}
