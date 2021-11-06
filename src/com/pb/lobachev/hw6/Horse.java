package com.pb.lobachev.hw6;

import java.util.Objects;

public class Horse extends Animal {
   // String name = "horse1";
    String weight = "136";
    //String food = "овес";

    public Horse(String location, String food) {
        super(location, food);
    }

    @Override
    public void makeNoise(){
        System.out.println("и го го я на мид");
    }
    @Override
    public void eat(){
        System.out.println("овес");
    }

    @Override
    public void sleep(){
        System.out.println("спит ночью");
    }

    @Override
    public int hashCode() {
        return Objects.hash(location, food);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Horse horse = (Horse) o;
        return  Objects.equals(location, horse.location)&& Objects.equals(food, horse.food);
    }

    @Override
    public String toString() {
        return super.toString();
    }

// public Horse(String name) {
     //   super(name);
   // }
}
