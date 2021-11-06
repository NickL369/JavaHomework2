package com.pb.lobachev.hw6;

public class Animal {
    public   String food;
    public   String location;
    public   String name;



   // public Animal(String name) { this.name = name; }
    //public Animal(String food) { this.name = food; }
   // public Animal(String location) { this.name = location; }


    public Animal(String location,String food) {
        this.food = food;
          this.location = location;
    }

    public  void makeNoise(){
    };
    public  void eat(){
    };
    public  void sleep(){
    };

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void sleep(Animal animal){
        System.out.println(animal + " - животное спит");
    };




    }