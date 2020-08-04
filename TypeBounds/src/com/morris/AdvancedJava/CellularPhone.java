package com.morris.AdvancedJava;

public class CellularPhone extends LandLinePhone {
    private final boolean wired = false;
    private String serviceProvider;

    public CellularPhone(String serviceProvider) {
        super();
        this.serviceProvider = serviceProvider;
    }

    @Override
    public String toString() {
        return String.format("Cellular Phone : %s", this.serviceProvider);
    }

    @Override
    public boolean isWired() {
        return this.wired;
    }
}
