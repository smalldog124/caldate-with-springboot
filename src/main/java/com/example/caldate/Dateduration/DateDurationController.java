package com.example.caldate.Dateduration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api/v1/duration")
public class DateDurationController {

    @Autowired
    DateDurationService dateDurationService;

    @PostMapping("/cal")
    private DateDurationModel dateDuration(@RequestBody DateDurationModel dateModel ){
        return dateDurationService.calDuration(dateModel);
    }
}
