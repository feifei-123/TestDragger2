package com.example.testdragger2.fatherAndSon;

import com.example.testdragger2.car.Car;

import javax.inject.Inject;

public class Son {
    @Inject
    public Car car;

    @Inject
    public Bike bike;
}
