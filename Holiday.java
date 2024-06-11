package oopAssignment;

import java.util.Arrays;

public class Holiday {
    private String name;
    private int day;
    private String month;

    public Holiday(String name, int day, String month) {
        this.name = name;
        this.day = day > 0 && day <= 30 ? day : 1;
        this.month = month;
    }

    public static boolean inSameMonth(Holiday holiday1, Holiday holiday2) {
        if (holiday1 == null || holiday2 == null) {
            System.out.println("Invalid holiday input: holiday is null");
            return false;
        }

        if (holiday1.month == null || holiday2.month == null) {
            System.out.println("Invalid holiday input: month is null");
            return false;
        }

        return holiday1.month.equalsIgnoreCase(holiday2.month);
    }

    public boolean inSameMonth(Holiday holiday) {
        if (holiday == null || holiday.month == null) {
            System.out.println("Invalid input");
            return false;
        }
        if (month == null) {
            System.out.println("Invalid month value to compare with: month is null");
            return false;
        }
        return this.month.equals(holiday.month);
    }

    public static double avgDate(Holiday[] holidays) {
        if (holidays == null) {
            throw new IllegalArgumentException("array input can't be null");
        }
        double sum = 0;

        for (Holiday holiday : holidays)
            sum += holiday.day;


        double avg = holidays.length != 0 ? sum / holidays.length : 0.0;
        return avg;

        //if expecting null, divide by count
        /*
                int count = 0;
                for (Holiday holiday : holidays)
                    if (holiday != null) {
                        sum += holiday.day;
                        count++;
                    }
                double avg = count != 0 ? sum / count : 0.0;
        */


    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public static void main(String[] args) {
        Holiday holiday1 = new Holiday("Independence Day", 4, "July");
        Holiday holiday2 = new Holiday("6 October", 6, null);
        System.out.println(Holiday.inSameMonth(holiday1, holiday2));

        Holiday[] holidays = {holiday1, holiday2};
        try {
            System.out.println(Holiday.avgDate(holidays));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }

}