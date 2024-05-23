package oopAssignment;

import java.util.Arrays;

public class Holiday {
    private String name;
    private int day;
    private String month;

    public Holiday(String name, int day, String month) {
        this.name = name;
        this.day = day;
        this.month = month;
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

    public boolean inSameMonth(Holiday holiday) {
        return this.month.equals(holiday.month);
    }

    public static double avgDate(Holiday[] holidays) {
        if (holidays==null||holidays.length==0){
            return -1;
        }
        int sum = 0;
        for (Holiday holiday : holidays)
            if (holiday != null)
                sum += holiday.day;

        return (double) sum / holidays.length;
    }

    public static void main(String[] args) {
        Holiday holiday = new Holiday("“Independence Day",4,"July");
    }
}