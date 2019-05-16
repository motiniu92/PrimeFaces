
package com.coderbd;


public class Bus {
   private String id;
   private String year;
   private String brand;
   private String color;

    public Bus() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Bus(String id, String year, String brand, String color) {
        this.id = id;
        this.year = year;
        this.brand = brand;
        this.color = color;
    }
   
   
   
}
