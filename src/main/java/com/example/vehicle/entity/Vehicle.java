package com.example.vehicle.entity;

import javax.persistence.*;

@Entity
@Table(name = "vehicle")
public class Vehicle implements Expenses {

    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "odometer")
    double odometer = 0;

    @Column(name = "drivable")
    boolean drivable = false;

    @Column(name = "serviced")
    boolean serviced = true;

   // @Column(name = "fuel")
   @OneToOne(cascade = CascadeType.ALL)
   @JoinColumn(name = "fuel_id")
    public Fuel fuel;

    // @Column(name = "oil")
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "oil_id")
    public Oil oil;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "service_id")
    public Service service;

    @OneToOne(mappedBy = "vehicle", cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    private Car car;

    public Vehicle() {
    }


    public void isDrivable(){ // check if vehicle has fuel and is serviced
        if (fuel.getGauge() > 0 && serviced ){
            drivable = true;
        }
        drivable = false;
    }


    public void drive(double km) {
        if(fuel.getGauge() > 0){
            System.out.println("driving...");
        }
    }


    @Override
    public void fillUpFuel(double amount) {

        fuel.getFuelPrice();
        /*if (amount > fuel.getFuelPrice()){
            System.out.println("filling up fuel...");
        }*/
        System.out.println("no money...");
    }

    @Override
    public void service() {

    }


}
