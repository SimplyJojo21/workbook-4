package com.pluralsight;

//these are the variables
public class Reservation {
    private String roomType;
    private int numberOfNights;
    private boolean isWeekend;
    private double price;

    //this is the constructor
    public Reservation(String roomType, int numberOfNights, boolean isWeekend) {
        this.roomType = roomType;
        this.numberOfNights = numberOfNights;
        this.isWeekend = isWeekend;

        //setting price per room type
        if (roomType.equalsIgnoreCase("king")) {
            price = 139.00;
        } else if (roomType.equalsIgnoreCase("double")) {
            price = 124.00;
        }
        //price increases by 10% on weekends; 1.10 is equal to 100% + 10%
        if (isWeekend) {
            price *= 1.10;
        }


    }

    //these are the getter and setters
    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getNumberOfNights() {
        return numberOfNights;
    }

    public void setNumberOfNights(int numberOfNights) {
        this.numberOfNights = numberOfNights;
    }

    public boolean isWeekend() {
        return isWeekend;
    }

    public void setWeekend(boolean weekend) {
        isWeekend = weekend;
    }

    public double getPrice() {
        return price;
    }

    public double getReservationTotal() {
        return price * numberOfNights;
    }
}
