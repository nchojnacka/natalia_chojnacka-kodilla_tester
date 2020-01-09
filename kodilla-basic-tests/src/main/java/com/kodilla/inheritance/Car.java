package com.kodilla.inheritance;

public class Car {
        // dwie zmienne prywatne
        private int wheels;
        private int seats;
        //konstruktor Car
        public Car(int wheels, int seats) {
            this.wheels = wheels;
            this.seats = seats;
        }
        //metoda1
        public void turnOnLights() {
            System.out.println("Lights were turned on");
        }
        //metoda ktora zostala nadpisana w klasie Convertible
        public void openDoors() {
        System.out.println("Opening 4 doors");
        }
        //metoda2
        public void displayNumberOfSeats() {
        System.out.println("Number of seats: " + seats);
        }
        //getter1
        public int getWheels() {
            return wheels;
        }
        //getter2
        public int getSeats() {
            return seats;
        }

    }
