package com.pb.lobachev.hw6;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class VetСlinic {

    public static void main(String[] args) throws IllegalAccessException, InvocationTargetException, InstantiationException, NoSuchMethodException, ClassNotFoundException {

        Animal dog = new Dog("дом","собачий корм");
        Animal cat = new Cat("своей квартира которую он мне сдает","мои нервы");
        Animal horse = new Horse("стойло","овес");

        Animal[] animals = { dog, cat, horse };


        //Class clazz = cat.getClass();

        Class<?> vetClinicClazz = Class.forName("com.pb.lobachev.hw6.Veterinarian");
        Constructor constr = vetClinicClazz.getConstructor(new Class[] {});
        Object obj = constr.newInstance();
        for (int i = 0; i < animals.length; i++)

        ((Veterinarian) obj).treatAnimal(animals[i]);

            }






        }



