package com.morris.AdvancedJava;

public class Main {
    public static void main(String[] args) {
        LandLinePhone homephone = new LandLinePhone("Verizon");
        int numberOfKeysOnLandLine = homephone.getKeyCount();
        if ( homephone.isWired() ) {
            System.out.println("This is a LandLine with " + numberOfKeysOnLandLine + " keys");
        } else {
            System.out.println("Is this a CellPhone?");
        }
        CellularPhone cellphone = new CellularPhone("T-Mobile");
        int numberOfKeysOnCellularPhone = cellphone.getKeyCount();
        if ( !cellphone.isWired() ) {
            System.out.println("This is a CellPhone with " + numberOfKeysOnCellularPhone + " keys");
        }
        Laptop iMac = new Laptop(true, "macOS");
        System.out.println("iMac is blue tooth compatible: " + iMac.hasBlueToothService());
        System.out.println("iMac operating system: " + iMac.getOperatingSystem());
        // create a new phone container that has a upperbound of <T, LandLinePhone>
        // After trying to store a Laptop Object in the PhoneContainer there's a
        // compile error because the upperbound is LandLine phone which means we
        // can add a LandLine object and any subclasses of LandLine
        PhoneContainer<LandLinePhone> storage = new PhoneContainer<>();
        storage.addPhone(homephone);
        storage.addPhone(cellphone);
        String storageSheet = storage.viewContainer();
        System.out.println(storageSheet);

    }
}
