package com.aj.frame.auth.common.configuration;

/**
 * 因为DefaultIdStringsLoader类字段loadArgs没有set方法
 * 先声明这个bean然后再把这个bean的字段当做构造参数来创建DefaultIdStringsLoader
 */
public class DefaultIdStringsLoaderConstructor {

    private String charSet;

    private String loadArgs;

    public String getCharSet() {
        return charSet;
    }

    public void setCharSet(String charSet) {
        this.charSet = charSet;
    }

    public String getLoadArgs() {
        return loadArgs;
    }

    public void setLoadArgs(String loadArgs) {
        this.loadArgs = loadArgs;
    }

}

