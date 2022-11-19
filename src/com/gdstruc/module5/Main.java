package com.gdstruc.module5;

//import java.util.Objects;

public class Main {

    public static void main(String[] args) {


        Player Jinx = new Player(50,"Jinx",20);
        Player Vi = new Player(40,"Vi",15);
        Player Lux = new Player(30,"Lux",10);
        Player Ez = new Player(20,"Ez",5);
        Player Caitlyn = new Player(10,"Caitlyn",1);

        Hashtable hashtable = new Hashtable();

        hashtable.put(Jinx.getUserName(), Jinx);
        hashtable.put(Vi.getUserName(), Vi);
        hashtable.put(Lux.getUserName(), Lux);
        hashtable.put(Ez.getUserName(), Ez);
        hashtable.put(Caitlyn.getUserName(), Caitlyn);


        System.out.println("=============================");
        System.out.println("Hashtable Before Removing: ");
        hashtable.printHashtable();
        hashtable.remove("Jinx");

        System.out.println("=============================");

        System.out.println("Hashtable After Removing: ");
        System.out.println("\nRemove Fourth Element..\n");


        hashtable.printHashtable();

    }
}