package com.company;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SetVsListDemo {

    public static void main(String[] args) {
	    //1. List vs Set
        //- access by value/by index
        //- ordering

        //2. Set methods

        //3. Set types

        //4. HashSet internals
        //5. hashCode (generation time)
        //6. Custom object (Person, Car, Report)
        //7. equals and hashCode


        //Sets do NOT guarantee ordering (by adding)
        //List - access by index | Set - access by value

        List<Integer> list = new ArrayList<>();
        list.add(0);
        list.add(-15);
        list.add(22);
        list.add(141);
        list.add(-100500);
        System.out.println("List -> " + list);

        Set<Integer> set = new HashSet<>();
        set.add(0);
        set.add(-15);
        set.add(22);
        set.add(141);
        set.add(-100500);
        System.out.println("Set -> " + set.toString());

        //Set Types
        //HashSet (LinkedHashSet) | TreeSet


    }
}
