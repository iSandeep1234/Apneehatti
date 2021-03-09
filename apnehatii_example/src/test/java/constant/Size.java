package com.apneehatti.constant;

public enum Size {
    SMALL("SMALL"),
    MEDIUM("MEDIUM"),
    LARGE("LARGE"),
    EXTRA_LARGE("EXTRA_LARGE");

    private String code;

    Size(String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
