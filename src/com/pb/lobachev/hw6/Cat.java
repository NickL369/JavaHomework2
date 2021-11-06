package com.pb.lobachev.hw6;

import java.util.Objects;

public class Cat extends Animal{
   // String name = "ca1";
    String weight = "999";
    //String food = "мои нервы";


    public Cat(String location, String food) {
        super(location, food);
    }

    @Override
    public void makeNoise(){
        System.out.println("мяу");
    }
    @Override
    public void eat(){
        System.out.println("мои нервы");
    }
    @Override
    public void sleep(){
        System.out.println("спит всегда, когда не спишь ты");
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
