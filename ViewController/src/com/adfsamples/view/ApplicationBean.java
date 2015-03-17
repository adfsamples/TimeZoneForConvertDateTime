package com.adfsamples.view;

import java.util.TimeZone;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;

@ManagedBean
@ApplicationScoped
public class ApplicationBean extends TimeZoneUtils {

    // public static final String DEFAULT_APPLICATION_TIME_ZONE_ID = "UTC";
    public static final String DEFAULT_APPLICATION_TIME_ZONE_ID = null;

    private String applicationTimeZoneId = DEFAULT_APPLICATION_TIME_ZONE_ID;

    public ApplicationBean() {
    }

    public TimeZone getSystemTimeZone() {
        return TimeZone.getDefault();
    }

    public String getApplicationTimeZoneId() {
        return applicationTimeZoneId;
    }

    public void setApplicationTimeZoneId(String timeZoneId) {
        this.applicationTimeZoneId = timeZoneId;
    }

    public TimeZone getApplicationTimeZone() {
        if (applicationTimeZoneId == null) {
            return null;
        } else {
            return TimeZone.getTimeZone(applicationTimeZoneId);
        }
    }

}
