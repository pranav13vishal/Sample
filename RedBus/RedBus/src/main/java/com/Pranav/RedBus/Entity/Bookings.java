package com.Pranav.RedBus.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.format.annotation.DateTimeFormat;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "booking")
public class Bookings {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String email;
    private String PhoneNumber;
    private Integer age;
    private String gender;
    private String busNo;
    private String busName;
    private String source;
    private String destination;
    private Integer price;
    @DateTimeFormat(pattern = "MM-dd-yyyy")
    private String date;
    @DateTimeFormat(pattern = "HH-mm")
    private String time;
    private Integer duration;
    private Integer noOfPerson;
}
