package com.example.thesis.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.Date;

@Entity
@Data

public class DataModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "humidity")
    private Float humidity;
    @Column(name = "temperature")
    private Float temperature;
    @Column(name = "s1")
    private Integer s1;
    @Column(name = "s2")
    private Integer s2;
    @Column(name = "s3")
    private Integer s3;
    @Column(name = "time")
    private Date time;
}
