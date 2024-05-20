package com.cityex.city;

import java.util.Objects;

public class City {
    private String city;
    private int frequency;
    public City(){

    }

    public City(String city, int frequency) {
        this.city = city;
        this.frequency = frequency;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getFrequency() {
        return frequency;
    }

    public void setFrequency(int frequency) {
        this.frequency = frequency;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        City city1 = (City) o;
        return frequency == city1.frequency && Objects.equals(city, city1.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(city, frequency);
    }

    @Override
    public String toString() {
        return "City{" +
                "city='" + city + '\'' +
                ", frequency=" + frequency +
                '}';
    }
}
