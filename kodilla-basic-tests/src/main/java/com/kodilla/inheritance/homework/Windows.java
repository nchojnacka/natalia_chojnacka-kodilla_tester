package com.kodilla.inheritance.homework;

public class Windows extends Linux {

    public Windows(int year, int version, String adminWindows) {
        super(year, version, admin);
        this.year = year;
        this.version = version;
        this.admin = adminWindows;
    }

    public static void main(String[] args) {
        Windows windows = new Windows(2019, 5, admin);
        windows.turnOn();
        windows.turnOff();
    }

    @Override
    public void systemVersion() {
        System.out.println("System Widnows version is " + version);
    }

    @Override
    public void systemAdminName() {
        System.out.println("System Windows owner's nick name is " + admin );
    }

}
