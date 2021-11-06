package com.pb.lobachev.hw6;
import java.lang.reflect.Constructor;

public class VetСlinic {

    public static void main(String[] args) {

        Animal dog = new Dog("Dog3","дом");
        Animal cat = new Cat("Cat3","судя по выражению морды моего кота, я живу у него в квартире");
        Animal horse = new Horse("Horse3","стойло");

        Animal[] animals = { dog, cat, horse };
        dog.eat();
        dog.makeNoise();
        dog.sleep();
        System.out.println("");

        cat.eat();
        cat.makeNoise();
        cat.sleep();
        System.out.println("");

        horse.eat();
        horse.makeNoise();
        horse.sleep();
        System.out.println("");
        System.out.println("");
        System.out.println("");



    }
}
