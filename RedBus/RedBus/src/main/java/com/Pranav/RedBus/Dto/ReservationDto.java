package com.Pranav.RedBus.Dto;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ReservationDto {

    private Long id;
    @NotEmpty
    private String source;
    @NotEmpty
    private String destination;
//    @DateTimeFormat(pattern = "MM-dd-yyyy")
    @NotEmpty
    private String date;
    // user to search
}

