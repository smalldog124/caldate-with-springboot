package com.example.caldate.dateapi;

import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

@Service
public class CalDateServiceImpl implements CalDateService {
    public int SumTwoNumber(int x , int y){
        return x + y;
    }

    public int calAgeCustomer(String birthdate){

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate birthday = LocalDate.parse(birthdate,dateTimeFormatter);

        return  2019 - birthday.getYear();
    }
}
