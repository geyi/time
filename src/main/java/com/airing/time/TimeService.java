package com.airing.time;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeService {

    private TimeProperties timeProperties;

    public TimeService(TimeProperties timeProperties) {
        this.timeProperties = timeProperties;
    }

    public String getLocalTime() {
        String pattern = timeProperties.getPattern();
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        return sdf.format(new Date());
    }
}
