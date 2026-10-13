package com.hotel.roommanagementH2.entity;

public class StandedRoom extends Room{

    public StandedRoom(String id, double price, int capacity, String status) {
        super(id, price, capacity, status);
    }

    public double calculatePrice(int nights){
        return getPricePerNight() * nights;
    }
    public String getType(){
        return "Standard";
    }
}
