package com.airing.time;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(TimeProperties.class)
public class TimeAutoConfiguration {

    @Autowired
    private TimeProperties timeProperties;

    @Bean
    public TimeService timeService() {
        return new TimeService(timeProperties);
    }
}
