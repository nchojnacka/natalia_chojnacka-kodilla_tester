package com.kodilla.inheritance.homework;
import static com.kodilla.inheritance.homework.Linux.admin;

public class DemoClass {

    public static void main(String[] args) {

        Linux linux = new Linux(2020, 1, admin);
        linux.systemVersion();
        linux.systemAdminName();
        linux.turnOff();


        Windows windows = new Windows(2019,5,admin);
        windows.systemVersion();
        windows.systemAdminName();
        windows.turnOff();

    }
}
