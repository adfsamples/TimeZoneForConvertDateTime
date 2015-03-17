package com.adfsamples.view;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import java.util.TimeZone;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.model.SelectItem;

@ManagedBean
@SessionScoped
public class UserBean extends TimeZoneUtils {

    // public static final String DEFAULT_USER_TIME_ZONE_ID = "America/New_York";
    public static final String DEFAULT_USER_TIME_ZONE_ID = null;

    private String inputTimeZoneId = DEFAULT_USER_TIME_ZONE_ID;
    private String outputTimeZoneId = inputTimeZoneId;

    private Date dateTime = new Date(0L);

    public Date getDateTime() {
        return dateTime;
    }

    public void setDateTime(Date dateTime) {
        this.dateTime = dateTime;
    }

    public String getInputTimeZoneId() {
        return inputTimeZoneId;
    }

    public void setInputTimeZoneId(String inputTimeZoneId) {
        this.inputTimeZoneId = inputTimeZoneId;
    }

    public String getOutputTimeZoneId() {
        return outputTimeZoneId;
    }

    public void setOutputTimeZoneId(String outputTimeZoneId) {
        this.outputTimeZoneId = outputTimeZoneId;
    }

    public TimeZone getInputTimeZone() {
        if (inputTimeZoneId == null) {
            return null;
        } else {
            return TimeZone.getTimeZone(inputTimeZoneId);
        }
    }

    public TimeZone getOutputTimeZone() {
        if (outputTimeZoneId == null) {
            return null;
        } else {
            return TimeZone.getTimeZone(outputTimeZoneId);
        }
    }

}
