package com.example.vehicle.entity;

import javax.persistence.*;

@Entity
@Table(name = "oil")
public class Oil {

    @Id
    @Column(name = "id")
    private Long id;

    @Column(name = "capacity")
    private double capacity;

    @Column(name = "consumption")
    private double consumption;

    @Column(name = "gauge")
    private double gauge;

    @OneToOne(mappedBy = "oil", cascade = {CascadeType.DETACH, CascadeType.MERGE, CascadeType.PERSIST, CascadeType.REFRESH})
    private Vehicle vehicle;


    public Oil() {
    }

}
