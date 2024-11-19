package com.Pranav.RedBus.Dto;

import org.springframework.format.annotation.DateTimeFormat;

public class BusDataDto {
    private Long id;
    private String busNo;
    private String busName;
    private String capacity;
    private String source;
    private String destination;
    private Integer price;
    @DateTimeFormat(pattern = "MM-dd-yyyy")
    private String date;
    @DateTimeFormat(pattern = "HH-mm")
    private String time;
    private Integer duration;
    private Integer availableSeats;
}
