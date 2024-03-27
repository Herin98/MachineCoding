package com.demo.entity;

public class ParkingSlot {
    private int floorId;
    private int slotId;
    private VehicleType vehicleType;
    private Vehicle vehicle;
    private boolean isEmpty;

    public ParkingSlot(int slotId, VehicleType vehicleType, boolean isEmpty) {
        this.slotId = slotId;
        this.vehicleType = vehicleType;
        this.isEmpty = isEmpty;
    }

    public int getFloorId() {
        return floorId;
    }

    public void setFloorId(int floorId) {
        this.floorId = floorId;
    }

    public int getSlotId() {
        return slotId;
    }

    public void setSlotId(int slotId) {
        this.slotId = slotId;
    }

    public VehicleType getVehicleType() {
        return vehicleType;
    }

    public void setVehicleType(VehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public void setVehicle(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public void setEmpty(boolean empty) {
        isEmpty = empty;
    }
}
