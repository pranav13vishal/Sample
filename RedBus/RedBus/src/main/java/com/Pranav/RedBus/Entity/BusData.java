package com.Pranav.RedBus.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.ArrayList;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "busdata")
public class BusData {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false,unique = true)
    private String busNo;
    @Column(nullable = false)
    private String busName;
    @Column(nullable = false)
    private String capacity;
    @Column(nullable = false)
    private String source;
    @Column(nullable = false)
    private String destination;
    @Column(nullable = false)
    private Integer price;
    @DateTimeFormat(pattern = "MM-dd-yyyy")
    @Column(nullable = false)
    private String date;
    @DateTimeFormat(pattern = "HH-mm")
    @Column(nullable = false)
    private String time;
    @Column(nullable = false)
    private Integer duration;
    @Column(nullable = false)
    private Integer availableSeats;
}
