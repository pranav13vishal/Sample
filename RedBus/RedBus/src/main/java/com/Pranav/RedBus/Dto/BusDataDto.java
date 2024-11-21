package com.Pranav.RedBus.Dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.criteria.CriteriaBuilder;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDate;
import java.time.LocalTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BusDataDto {
    private Long id;
    private String busNumber;
    private String busName;
    private Long capacity;
    private String source;
    private String destination;
    private Long price;
//    @DateTimeFormat(pattern = "MM-dd-yyyy")
//    @JsonFormat(pattern = "yyyy-MM-dd")
    private String  date;
//    @DateTimeFormat(pattern = "HH-mm")
//    @JsonFormat(pattern = "HH-mm")
    private String time;
    private Long duration;
    private Long availableSeats;
}
