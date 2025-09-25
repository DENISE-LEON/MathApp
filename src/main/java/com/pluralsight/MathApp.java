package com.pluralsight;

public class MathApp {

    public static void main(String[] args) {

        //variables for bob & gary salary
        int bob_salary = 80000;
        int gary_salary = 6700000;

        //highest salary
        int highest_salary = Math.max(bob_salary, gary_salary);

        //highest salary print
        System.out.println("The highest salary is:" + " " + highest_salary );

        //smallest value
        int carPrice = 50000;
        int truckPrice = 200000;

        int lowest_price = Math.min(carPrice, truckPrice);
        System.out.println("The lowest price is:" + " " + lowest_price);

        //Area of circle
        double radius = 7.25;
        double area = Math.PI * radius * radius;
        System.out.println("The area of the circle is:" + area);

        //square root
        double num = 25.0;
        double square_root = Math.sqrt(num);
        System.out.println("The square root of" + " " + num + " " + "is" + " " +  square_root);

        //finding the distance
        int x1 = 5;
        int y1 = 10;
        int x2 = 85;
        int y2 = 50;
        double distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));

        System.out.println("The distance between the two points is:" + " " + distance);

        //absolute value
        double number = -3.8;
        double abs_value = Math.abs(number);

        System.out.println("The absolute value of" + " " + number + " " + "is" + " " + abs_value);

        //random number display
        double random_number = Math.random();

        System.out.println("The random number is: " + " " + random_number);

        //Minutes in 24 days
        int days = 24;
        int hoursPerDay = 24;
        int minutesPerHour = 60;

        int mins_in_day = days * hoursPerDay * minutesPerHour;

        System.out.println("There are" + " " + mins_in_day + " " + "minutes in" + " " + days + " days");

        //milliseconds in 24 days
       int milliseconds = mins_in_day * 60 * 1000;

        System.out.println( "There are" + " " + milliseconds + " " + "milliseconds in " + " " + days + " " + "days");






    }
}
