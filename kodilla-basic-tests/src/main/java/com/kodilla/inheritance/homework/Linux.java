package com.kodilla.inheritance.homework;
public class Linux extends OperatingSystem {

    public static String  admin;

    public Linux(int year, int version, String adminLinux) {
        super(year, version, admin);
        this.year = year;
        this.version = version;
        this.admin = adminLinux;
    }

    //metoda 1 - wersja systemu
    public void systemVersion() {
        System.out.println("System Linux version is " + version);
    }

    //metoda 2 - nazwa administratora systemu
    public void systemAdminName() {
        System.out.println("System Linux owner's nick name is " + admin);
    }
}
