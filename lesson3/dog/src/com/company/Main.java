package com.company;

public class Main {
    static Dog[] dogs = new Dog[3]; // [null,null,null]
    public static void main(String[] args) {

        int[] arr = new int[4]; // [0,0,0,0]

        Person[] owners = new Person[3];
        for (int i = 0 ; i < owners.length; i++) {
            owners[i] = new Person("Moshe"+i,"GAR BABAIT","052249906"+i,true);
            System.out.println(owners[i].getName());
        }

        for (int i = 0 ; i < dogs.length; i++) {
          dogs[i] = new Dog("lary"+i,owners[i]);
            System.out.println(dogs[i].getName());
        }
        System.out.println("-----------------");
        System.out.println("--find owner-----");
        findOwner(2);
        System.out.println("-----------------");
        System.out.println("-- owners-----");
        Person p;
        for (int i = 0; i < dogs.length; i++) {
            p = dogs[i].getOwner();
            p.getName();
            System.out.println(p.getName());
            System.out.println(dogs[i].getOwner().getName());
        }

 /*     arr[0] = 456; // [456,0,0,0]
        dogs[0] = new Dog("lady"); // com.company.Dog@12ba5c7, null,null
       for (int i = 0 ; i < 145; i++) {
            new Dog("moti");
        }
        Dog d1 = new Dog("Lucky");
        System.out.println(d1.getId());

        System.out.println(Dog.getCounter());
        System.out.println(d1.getName());
        d1.setName("JoJo");
        System.out.println(d1.getName());
        System.out.println(d1.isAlive());
        d1.setNumOfLegs(3);
*/
    }
    public static void findOwner(int id) {
        Person owner;
        String msg;
        for (int i = 0; i< dogs.length; i++) {
            if (id == dogs[i].getId()) {
                owner = dogs[i].getOwner();
                msg = owner.isAvailable() ?
                        "Owner " + owner.getName()+" Call: "+ owner.getPhone() :
                        "Owner " + owner.getName()+" is not available, Go to his home at: " + owner.getAddress();
                System.out.println(msg);
                return;
            }
        }
        System.out.println("not found such dog for id: "+id);
    }
}
