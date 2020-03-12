package com.start.demo.format;

import com.alibaba.fastjson.JSON;

/**
 * @author qinfeng
 * @date 2020/3/12
 */
public class JsonFormat implements FormatProcessor {

    @Override
    public <T> String format(T t) {
        return "JsonFormat:"+JSON.toJSONString(t);
    }
}
