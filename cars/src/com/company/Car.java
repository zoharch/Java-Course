package com.company;

/**
 * Created by hackeru on 6/5/2017.
 */
public class Car {

    String lp;
    String owner;
    String color;
    int year;
    boolean auto;
    int numOfDoors;
    int hand;
    int position;

    public Car (String carLisencePalate,String carOwner,String carColor,int carYear, boolean autoGear,int doors) {
      lp = carLisencePalate;
      owner = carOwner;
      color = carColor;
      year = carYear;
      auto = autoGear;
      numOfDoors = doors;
      // this is not input in the constractor, the constractor builds it by itself
      hand = 1;
    }

    public boolean movingHand (String newName) {
        if (newName != owner) {
            hand +=1;
            owner = newName;
            return true;
        }
        return false;
    }

    public void drive (int movements) {
       position = movements;
    }
}
