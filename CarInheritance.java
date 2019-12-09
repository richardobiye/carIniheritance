package com.rex.fix;

/**
 * Car Inheritance In this challenge, you will be asked to build on an abstract class
 * and initialize an instance of each class with a variable. The program will then test
 * your implementation by retrieving the data you stored. The locked code in the editor
 * does the following: Font 1. Declares an abstract class named Car with the implementations
 * for getIsSedan() and getSeats() methods, as well as an abstract method named getMileage().
 * 2. Creates WagonR Honda City, or InnovaCrysta object based on input (O for WagonR,
 * 1 for Honda City and 2 for InnovaCrysta). 3. Calls the getIsSedan ().getSeats(), 
 * and getMileage () methods on the object. Gass Dugas Car Sedan Boom Sieg +Carbadan den Bedan)
 * Boolean .Seving M O : String Honda Honda -el ): String Innovaya • Mengering
 * The details for each car are provided below -
 * The details for each car are provided below - 1. WagonR is not a sedan and has 4 seats.
 * 2. Honda City is a sedan and has 4 seats. 3. InnovaCrysta is not a sedan and has 6 seats.
 * Complete the code in the editor below to implement the following: 1. Three classes named,
 * WagonR HondaCity, and InnovaCrysta that inherit from the Car class.
 * 2. One integer argument is provided to the constructor which is the mileage of the car.
 * 3. Each class must implement the getMileage() method which returns a string in the form
 * of kmpl where is the value provided to constructor. Constraints •
 * The integer in first line will be in between 0 and 2 inclusive. •
 * The integer in the second line (i.e. mileage will be in between 5 and 30 inclusive.
 * Input Format For Custom Testing Sample Case 0 Sample Input For Custom
 * Testing 22 Sample Output A WagonR is not Sedan, is 4-seater, an
 * import java.util.Scanner;- Java 8 // Write your code here. * WagonR class
 * * HondaCity class * InnovaCrysta class public class Solution public static
 * void main(String[] args) throws IOException {
 *  Buffered Reader bufferedReader = new BufferedReader(new InputStreamReader (System.in));
 *  int carType = Integer.parseInt(buffered Reader.readLine().trim(); int carMileage -
 *  Integer.parseInt(bufferedReader.readLine().trim()); if (carType == e) { Car wagonR = new WagonR
 *  (carMileage); wagonR.printCar("WagonR"); if(carType == 1) { Car hondaCity
 *  = new HondaCity(carMileage); hondaCity.printCar ("HondaCity");
 */

import java.util.Scanner;

abstract class Car {
    protected Boolean isSedan;
    protected String seats;

    public Car(Boolean isSedan, String seats) {
        this.isSedan = isSedan;
        this.seats = seats;
    }

    public Boolean getIsSedan() {
        return this.isSedan;
    }

    public String getSeats() {
        return this.seats;
    }

    public abstract String getMileage();
}

class WagonR extends Car {
    private String mileage;

    public WagonR(Integer mileage) {
        super(false, "4");
        this.mileage = mileage + " kmpl";
        System.out.println("A WagonR is a sedan=" + getIsSedan() + ",no of seats=" + getSeats() + ",mileage=" + getMileage());
    }

    public String getMileage() {
        return this.mileage;
    }
}

class HondaCity extends Car {
    private String mileage;

    public HondaCity(Integer mileage) {
        super(true, "4");
        this.mileage = mileage + " kmpl";
        System.out.println("A HondaCity is a sedan=" + getIsSedan() + ",no of seats=" + getSeats() + ",mileage=" + getMileage());
    }

    public String getMileage() {
        return this.mileage;
    }
}

class InnovaCrysta extends Car {
    private String mileage;

    public InnovaCrysta(Integer mileage) {
        super(false, "6");
        this.mileage = mileage + " kmpl";
        System.out.println("A InnovaCrysta is a sedan=" + getIsSedan() + ",no of seats=" + getSeats() + ",mileage=" + getMileage());
    }

    public String getMileage() {
        return this.mileage;
    }
}

class CarFactory {
    public Car getCar(int type, int mileage) {
        if (type == 0) {
            return new WagonR(mileage);
        } else if (type == 1) {
            return new HondaCity(mileage);
        } else if (type == 2) {
            return new InnovaCrysta(mileage);
        }
        return null;
    }
}

public class CarInheritance {
    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();
        Scanner scanner = new Scanner(System.in);
        int type = scanner.nextInt();
        int mileage = scanner.nextInt();
        carFactory.getCar(type, mileage);
    }
}
