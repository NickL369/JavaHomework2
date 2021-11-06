package com.pb.lobachev.hw6;

import java.util.Objects;

public class Dog extends Animal {

    public Dog(String food,String location) {
        super(food,location);
    }

   // String name = "dog1";
    String weight = "9";

    @Override
    public void makeNoise(){
        System.out.println("ауф");
    }
    @Override
    public void eat(){
        System.out.println("это собака");
    }

    @Override
    public void sleep(){
        System.out.println("спит обычно, когда спит человек");
    }

    @Override
    public int hashCode() {
        return Objects.hash(location, food);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return  Objects.equals(location, cat.location)&& Objects.equals(food, cat.food);
    }



}
