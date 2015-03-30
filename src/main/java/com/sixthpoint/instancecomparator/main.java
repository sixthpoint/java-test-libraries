package com.sixthpoint.instancecomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

/**
 * A simple program to demonstrate collection sorting across 2 separate lists of
 * objects
 *
 * @author sixthpoint
 */
public class main {

    public static void main(String[] args) {

        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat("Chester", new Date(105, 9, 4)));
        cats.add(new Cat("Peaches", new Date(105, 8, 1)));

        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog("Willie", new Date(115, 2, 4)));
        dogs.add(new Dog("Buster", new Date(89, 3, 4)));

        List<Object> objects = new ArrayList<>();

        objects.addAll(cats);
        objects.addAll(dogs);

        Collections.sort(objects, new Comparator<Object>() {
            @Override
            public int compare(Object m1, Object m2) {
                Date d1 = null;
                Date d2 = null;

                if (m1 instanceof Cat) {
                    d1 = ((Cat) m1).getDob();
                } else {
                    d1 = ((Dog) m1).getDob();
                }

                if (m2 instanceof Cat) {
                    d2 = ((Cat) m2).getDob();
                } else {
                    d2 = ((Dog) m2).getDob();
                }

                return d1.compareTo(d2);
            }
        });

        for (Object o : objects) {
            if (o instanceof Cat) {
                System.out.println("Name: " + ((Animal) o).getName() + " DOB: " + ((Cat) o).getDob());
            } else {
                System.out.println("Name: " + ((Animal) o).getName() + " DOB: " + ((Dog) o).getDob());
            }
        }

    }

}
