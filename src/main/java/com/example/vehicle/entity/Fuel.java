package com.example.vehicle.entity;

import javax.persistence.*;

@Entity
@Table(name = "fuel")
public class Fuel {

    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "fuel_price")
    private  double fuelPrice = 15.23;

    @Column(name = "capacity")
    private double capacity; // 60 liter

    @Column(name = "consumption")
    private double consumption; // 5.6 liter per 100km  5.6/100    0.056/1

    @Column(name = "gauge")
    private double gauge; //60 liter
    //private double fuelPerKilometer = 0;

    // add new field for instructor
    @OneToOne(mappedBy = "fuel", cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    private Vehicle vehicle;


    public Fuel() {
    }


    public double getFuelPrice() {
        return fuelPrice;
    }

    public void setFuelPrice(double fuelPrice) {
        this.fuelPrice = fuelPrice;
    }

    public double getCapacity() {
        return capacity;
    }

    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

    public double getConsumption() {
        return consumption;
    }

    public void setConsumption(double consumption) {
        this.consumption = consumption;
    }

    public double getGauge() {
        return gauge;
    }

    public void setGauge(double gauge) {
        this.gauge = gauge;
    }

    /*public double getFuelPerKilometer() {
        return fuelPerKilometer;
    }

    public void setFuelPerKilometer(double fuelPerKilometer) {
        this.fuelPerKilometer = fuelPerKilometer;
    }*/
}
