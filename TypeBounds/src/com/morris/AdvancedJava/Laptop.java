package com.morris.AdvancedJava;

public class Laptop {
    private final int keys = 101;
    private  boolean bluetooth;
    private  String operatingSystem;

    public Laptop() {
    }

    public Laptop(boolean bluetooth, String operatingSystem) {
        this.bluetooth = bluetooth;
        this.operatingSystem = operatingSystem;
    }

    public boolean hasBlueToothService() {
        return this.bluetooth;
    }

    public String getOperatingSystem() {
        return this.operatingSystem;
    }

    public int getKeys() {
        return keys;
    }
}
