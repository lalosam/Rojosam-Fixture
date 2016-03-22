package com.rojosam;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;

public class Rojofixture {

    private Logger LOG = LoggerFactory.getLogger(this.getClass());
    private String testId = null;

    public Rojofixture(String testId, String logName) {
        this.testId = testId;
        MDC.put("environment", logName);
        LOG.warn("Test page: " + testId);
    }

    public Rojofixture(String testId) {
        this(testId, "default");
    }

    public String method1(String s) {
        LOG.info("Method " + s);
        return "9" + testId + s;
    }

}
