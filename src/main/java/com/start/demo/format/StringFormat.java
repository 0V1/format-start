package com.start.demo.format;

/**
 * @author qinfeng
 * @date 2020/3/12
 */
public class StringFormat implements FormatProcessor {

    @Override
    public <T> String format(T t) {

        return "StringFormat:"+String.valueOf(t);
    }
}
