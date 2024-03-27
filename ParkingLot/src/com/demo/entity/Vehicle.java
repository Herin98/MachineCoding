package com.demo.entity;

public class Vehicle {
    private String registrationId;
    private VehicleType vehicleType;
    private String colour;
    private String ticketId;
    private ParkingSlot parkingSlot;

    public Vehicle(VehicleType vehicleType, ParkingSlot parkingSlot, String colour, String registrationId) {
        this.registrationId = registrationId;
        this.vehicleType = vehicleType;
        this.colour = colour;
        this.parkingSlot = parkingSlot;
    }

    public String getRegistrationId() {
        return registrationId;
    }

    public void setRegistrationId(String registrationId) {
        this.registrationId = registrationId;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getTicketId() {
        return ticketId;
    }

    public void setTicketId(String ticketId) {
        this.ticketId = ticketId;
    }

    public ParkingSlot getParkingSlot() {
        return parkingSlot;
    }

    public void setParkingSlot(ParkingSlot parkingSlot) {
        this.parkingSlot = parkingSlot;
    }
}
