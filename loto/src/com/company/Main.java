package com.company;

import java.util.Arrays;
import java.util.Random;

public class Main {
    static int[] myLotto = {16,6,19,2,3,14};
    static int myExtra = 6;

    static int[] generateeLotto = new int[6];
    static int generatedExtra;

    static Random random = new Random();

    public static void main(String[] args) {
        extra();
        lotto();
        int winner = checLotto();
        System.out.println("The lotto nombers are:"+ Arrays.toString(generateeLotto));
        System.out.println("My lotto is:"+Arrays.toString(myLotto));
        System.out.println("Number of sucesses:"+winner);

    }

    public  static boolean find (int[] arr, int x) {
        for (int i = 0; i < arr.length && arr[i]!=0; i++) {
            if (x==arr[i]) {
                return true;
            }
        }
        return false;
    }

    public static void lotto() {
        int tmp;
        for (int i = 0;i<generateeLotto.length; i++) {
            do {
                tmp = 1+ random.nextInt(36);
            } while (find( generateeLotto,tmp));
            generateeLotto[i] = tmp;
        }
    }

    public static void extra() {
        // the boundering is the top boundering, not included
        //0-7
        generatedExtra = random.nextInt(8);
    }

    public static int checLotto() {
        System.out.println("My lotto:"+Arrays.toString(myLotto));
        System.out.println("Lotto:"+ Arrays.toString(generateeLotto));

       int counter=0;
       for (int i= 0; i<myLotto.length;i++) {
           System.out.println("i =" + i);
           for (int j=0;j<generateeLotto.length; j++) {
               System.out.print("j =" + j);
               counter = (myLotto[i] ==generateeLotto[j]) ? counter+1:counter;
               System.out.print(" counter: "+counter + " , mylotto: "+myLotto[i] + " , Lotto: "+generateeLotto[j] + "  ");
               System.out.println(" ");
           }
           System.out.println(" ");
       }
       return counter;
    }
}
