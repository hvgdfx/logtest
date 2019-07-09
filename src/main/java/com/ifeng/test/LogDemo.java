package com.ifeng.test;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LogDemo {

    private static Logger alogger = LoggerFactory.getLogger("demo1");
    private static Logger blogger = LoggerFactory.getLogger("demo2");
    private static Logger clogger = LoggerFactory.getLogger("demo3");

    public static void main(String[] args) {
        alogger.info("aaaa");
        blogger.info("bbbb");
        clogger.info("cccc");
        alogger.warn("a warning");
        alogger.debug("a debug");
        alogger.error("a error");
        alogger.trace("a trace");
    }
}
