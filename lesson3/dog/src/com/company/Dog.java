package com.company;

/**
 * Created by hackeru on 6/12/2017.
 */
public class Dog {
    private static int counter; // common for all objects
    private int numOfLegs;
    private String name;
    private int id;
    private boolean alive;
    private Person owner;

    public Dog(String name,Person owner) {
        this.name = name;
        numOfLegs = 4;
        id = counter ++;
        alive = true;
        this.owner = owner;
    }

    public static int getCounter() {
        return counter;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isAlive() {
        return alive;
    }

    public int getNumOfLegs() {
        return numOfLegs;
    }

    public static void setCounter(int counter) {
        Dog.counter = counter;
    }

    public void setNumOfLegs(int numOfLegs) {
        if (numOfLegs >=0 && numOfLegs <=4) {
            this.numOfLegs = numOfLegs;
        } else {
            System.out.println("a dog cannot have " + numOfLegs + " legs");
        }
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setAlive(boolean alive) {
        this.alive = alive;
    }

    public Person getOwner() {
        return owner;
    }
}

