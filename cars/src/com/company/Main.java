package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
//	    Car c1 = new Car("3435646356");
//        for (int i =0 ; i<100; i++) {
//            Car c2 = new Car("q234 1q2e4");
//        }
//        System.out.println(c1.lp);
        //
        Car fiat = new Car("2345235","moshe","red",1957, true, 5);
        Car pego = new Car("2340000235","suzi","brown",1988, false, 5);
        System.out.println(fiat.color);
        System.out.println(pego.color);
        Car c1 = new Car("2340000235","suzi","brown",1988, false, 5);
        Car c2 = c1;
        System.out.println(c1.color);
        System.out.println(c2.color);
        c2.color = "black";
        System.out.println(c1.color);
        System.out.println(c2.color);
        System.out.println("-----------------------------");
        System.out.println("------start position : ------");
        System.out.println(fiat.position);
        System.out.println(pego.position);
        fiat.drive(3);
        pego.drive(67);
        pego.drive(-44);
        pego.drive(-6);
        System.out.println("------end position : ------");
        System.out.println(fiat.position);
        System.out.println(pego.position);
        String s = new String();
        Random x = new Random();

        String sucss;
        System.out.println("---------------------------------------");
        System.out.println("Pego cars owner is: "+ pego.owner);
        sucss = (pego.movingHand("Jorge")) ? "The moving Hand was succesful to: " + pego.owner : "Catch this fith ! " +  pego.owner;
        System.out.println(sucss);
        System.out.println("---------------------------------------");
        System.out.println("The hand is: " + pego.hand);
        System.out.println("---------------------------------------");
        System.out.println("Pego cars owner is: "+ pego.owner);
        sucss = (pego.movingHand("Jorge")) ? "The moving Hand was succesful to: " + pego.owner : "Catch this fith ! " +  pego.owner;
        System.out.println(sucss);
        System.out.println("---------------------------------------");
        System.out.println("The hand is: " + pego.hand);

    }
}
