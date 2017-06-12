package com.company;

import java.lang.reflect.Array;

/**
 * Created by hackeru on 6/12/2017.
 */
public class Hall {
    private boolean[] seats;
    private String name;

    public Hall (String name, int numOfSeats) {
        seats = new boolean[numOfSeats];
        this.name = name;
    }
    public int buyTicket() {
        for (int i = 0 ; i < seats.length; i++) {
            if (!seats[i]) {
                seats[i] = true;
                return i;
            }
        }
        return  -1;
    }
    public boolean buyTicket(int seatNumber) {
        if (isSeatNumberCorrcet(seatNumber)) {
            if (!seats[seatNumber]) {
                seats[seatNumber]=true;
                return true;
            }
        }
        return  false;
    }
    public boolean cancelTicket(int seatNumber) {
        if (isSeatNumberCorrcet(seatNumber)) {
            if (!seats[seatNumber]) {
                return false;
            } else {
                seats[seatNumber]=false;
                return true;
            }
        }
        return false;
    }
    public int buyGroup(int seatsAmount) {
        int counter,j;
        if (seatsAmount<0 || seatsAmount>seats.length) {
            return -1;
        }
        for (int i= 0; i< seats.length; i++) {
            counter = 0;
            for (j = 0 ; j < seatsAmount; j++) {
                if (seats[i]) {
                    break;
                }
                counter++;
            }
            if (counter == seatsAmount) {
                for (j= i; j < seatsAmount; j++) {
                    seats[j]=true;
                }
                return i;
            }
        }
       return -1;
    }

   public String getName() {
        return name;
   }
   public void showHall() {
       for (int i= 0 ; i< seats.length; i++) {
           System.out.print(seats[i]+" ");
       }
       System.out.println(" ");
   }
   private boolean isSeatNumberCorrcet (int seatNumber) {
       if (seatNumber>=0 && seatNumber<=seats.length) {
           return true;
       } else {
           return false;
       }
   }
}
