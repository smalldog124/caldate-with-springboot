package com.example.caldate.Dateduration;

import org.springframework.stereotype.Service;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
@Service
public class DateDurationImpl implements DateDurationService {

    public DateDurationModel calDuration(DateDurationModel dateDuration){

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        LocalDateTime startDate = paresStringToTime(dateDuration.getStartDate(),dateTimeFormatter);
        LocalDateTime endDate = paresStringToTime(dateDuration.getEndDate(),dateTimeFormatter);

        Long durationDay = durationDay(startDate,endDate);
        Long durationHours = durationHours(startDate,endDate);
        Long durationMins = durationMillis(startDate,endDate);

        DurationModel durationModel = new DurationModel();
        dateDuration.setDuration(durationModel);
        dateDuration.setDurationInfo(durationDay,durationHours,durationMins);

        return  dateDuration;
    }

    private LocalDateTime paresStringToTime(String Date, DateTimeFormatter format){
        return LocalDateTime.parse(Date,format);
    }

    private Long durationDay(LocalDateTime startDate, LocalDateTime endDate){
        return Duration.between(startDate,endDate).toDays();
    }
    private Long durationHours(LocalDateTime startDate, LocalDateTime endDate){
        return Duration.between(startDate,endDate).toHours();
    }
    private Long durationMillis(LocalDateTime startDate, LocalDateTime endDate){
        return Duration.between(startDate,endDate).toMillis();
    }
}
