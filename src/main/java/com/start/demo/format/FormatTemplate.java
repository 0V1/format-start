package com.start.demo.format;

import com.start.demo.configuration.FormatProperties;

/**
 * @author qinfeng
 * @date 2020/3/12
 */
public class FormatTemplate {

    private FormatProcessor formatProcessor;

    private FormatProperties formatPreperties;

    public FormatTemplate(FormatProcessor formatProcessor, FormatProperties formatPreperties) {
        this.formatProcessor = formatProcessor;
        this.formatPreperties = formatPreperties;
    }

    public <T> String doExecute(T t){
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("begin doExecute").append("</br>");
        stringBuilder.append("properties:").append(formatPreperties.getInfo()).append("</br>");
        stringBuilder.append("format resut:").append(formatProcessor.format(t)).append("</br>");

        return stringBuilder.toString();
    }
}
