package com.adfsamples.view;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.TimeZone;

import javax.faces.model.SelectItem;

public class TimeZoneUtils {

    private static final Collection<SelectItem> timeZones;

    // for demo-only purpose, real application should consider list timezones
    // with display names in specific user locale.
    static {
        List<String> ids = Arrays.asList(TimeZone.getAvailableIDs());
        Collections.sort(ids);
        
        // add no selection option
        timeZones = new ArrayList<SelectItem>(ids.size() + 1);
        
        // add all available time zones
        timeZones.add(new SelectItem(null, "Please select..."));
        for (String id : ids) {
            timeZones.add(new SelectItem(id, id));
        }
    }

    public TimeZoneUtils() {
    }

    public Collection<SelectItem> getTimeZones() {
        return timeZones;
    }

}
