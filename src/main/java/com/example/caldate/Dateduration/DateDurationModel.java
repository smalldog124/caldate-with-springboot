package com.example.caldate.Dateduration;

public class DateDurationModel {
    private String startDate;
    private  String endDate;
    private  DurationModel duration;

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public DurationModel getDuration() {
        return duration;
    }

    public void setDuration(DurationModel duration) {
        this.duration = duration;
    }

    public void setDurationInfo(Long days, Long hours , Long minutes){
        duration.setDurationDay(days.intValue());
        duration.setDurationHours(hours.intValue());
        duration.setDurationmin(minutes.intValue());
    }

}
