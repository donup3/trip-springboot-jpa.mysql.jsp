package com.trip.tripsoda.domain;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Setter
@Getter
public class TripDestination {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "trip_destination_id")
    private Long id;

    private String country;

    private String city;

    private String region;

    private String code;

    private String name;

    private String phone;

    private int fee;

    private String operatingTime;

    private String tag;

    private String favorite;// 외향 vs 내향 , 개방 vs 폐쇄성

    private String guide;//entity로 바꿀가능성 있음

    @OneToMany(mappedBy ="tripDestination")
    private List<TripPhoto> tripPhoto=new ArrayList<>();

    private boolean korea;

    private boolean english;

}
