package com.morris.AdvancedJava;

public class LandLinePhone {
    private final int keys = 12;
    private final boolean wired = true;
    private String serviceProvider;

    public LandLinePhone() {
    }
    public LandLinePhone(String serviceProvider) {
        this.serviceProvider = serviceProvider;
    }

    public boolean isWired() {
        return this.wired;
    }

    public int getKeyCount() {
        return this.keys;
    }

    public String getServiceProvider() {
        return this.serviceProvider;
    }

    public void setServiceProvider(String sp) {
        this.serviceProvider = sp;
    }

    @Override
    public String toString() {
        return String.format("LandLine Phone : %s", this.serviceProvider);
    }
}
