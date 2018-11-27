package com.company;

public class Student extends Man1 {
    private int year;


    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = this.year + year;
    }
}
