package com.turkishtechnology.hackathon.util;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateUtil {
    
    public static final DateTimeFormatter GlobalDateFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public static LocalDate toLocalDateTime(String strDate) {
        return LocalDate.parse(strDate, GlobalDateFormatter);
    }

    public static LocalTime toLocalTime(String strDate) {
        return LocalTime.parse(strDate);
    }
}
