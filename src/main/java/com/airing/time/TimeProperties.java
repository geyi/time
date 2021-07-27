package com.airing.time;

import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "time")
public class TimeProperties {
    private String pattern;

    public String getPattern() {
        return pattern;
    }

    public void setPattern(String pattern) {
        this.pattern = pattern;
    }
}
