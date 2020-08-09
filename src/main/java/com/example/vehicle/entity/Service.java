package com.example.vehicle.entity;

import javax.persistence.*;

@Entity
@Table(name = "service")
public class Service {

    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "service_cost")
    private double serviceCost;

    @OneToOne(mappedBy = "service", cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    private Vehicle vehicle;

    public Service() {
    }

    //add type of services

}
