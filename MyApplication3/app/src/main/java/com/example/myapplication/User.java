package com.example.myapplication;


import java.io.Serializable;

public class User implements Serializable {
    private String id;
    private  int age;
    private  String departurePoint;
    private String arrivalPoint;
    private String departureDate;
    private int cost;

    public User(String id, int age, String departurePoint, String arrivalPoint, String departureDate, int cost){
        this.id = id ;
        this.age = age;
        this.departurePoint = departurePoint;
        this.arrivalPoint = arrivalPoint;
        this.departureDate = departureDate;
        this.cost = cost;
    }
    public String getId() {
        return id;
    }
    public int getAge() {
        return age;
    }
    public String getDeparturePoint() {
        return departurePoint;
    }
    public String getArrivalPoint() {
        return arrivalPoint;
    }
    public String getDepartureDate() {
        return departureDate;
    }
    public int getCost() {
        return cost;
    }




}

