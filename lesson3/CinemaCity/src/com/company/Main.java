package com.company;

public class Main {

    public static void main(String[] args) {
        Hall glilot = new Hall("Spy",10);
        System.out.println(glilot.getName());
        glilot.showHall();
        System.out.println(glilot.buyTicket());
        glilot.showHall();
        System.out.println(glilot.buyTicket());
        glilot.showHall();
        System.out.println(glilot.buyTicket());
        glilot.showHall();
        System.out.println("-------------but ticket chair # 5 ---------------");
        System.out.println(glilot.buyTicket(5));
        glilot.showHall();
        System.out.println("----------------------------");
        System.out.println("-------------but ticket chair # 2 ---------------");
        System.out.println(glilot.buyTicket(2));
        glilot.showHall();
        System.out.println("---------Cancel ticket # 5-------------------");
        System.out.println(glilot.cancelTicket(5));
        glilot.showHall();
        System.out.println("---------Cancel ticket # 5- again------------------");
        System.out.println(glilot.cancelTicket(5));
        glilot.showHall();
        System.out.println("---------By group of 5------------------");
        int sucess = glilot.buyGroup(5);
        if (sucess!=-1) {
            System.out.print("Sucess buying, first chair is " + sucess);
            System.out.println(" ");
        } else {
            System.out.println("no chairs available");
        }
        System.out.println("cinema seats are :");
        glilot.showHall();
        System.out.println("----------------------------");
    }
}
