package com.beards.sorta;

import javax.persistence.Id;
import java.util.Date;

/**
 * Created by joshuakelley on 11/28/16.
 */
public class ShiftEntry {
    @Id
    long id;
    Date startTime;
    Date endTime;
    TimeSheet timeSheet;

    public ShiftEntry() {
    }

    public ShiftEntry(Date startTime, Date endTime, TimeSheet timeSheet) {
        this.startTime = startTime;
        this.endTime = endTime;
        this.timeSheet = timeSheet;
    }

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public TimeSheet getTimeSheet() {
        return timeSheet;
    }

    public void setTimeSheet(TimeSheet timeSheet) {
        this.timeSheet = timeSheet;
    }
}
