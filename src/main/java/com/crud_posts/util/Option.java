package com.crud_posts.util;

public class Option {
    private final String flag;
    private final String opt;

    public Option(String flag, String opt) {
        this.flag = flag;
        this.opt = opt;
    }

    public String getFlag() {
        return flag;
    }

    public String getOpt() {
        return opt;
    }
}
