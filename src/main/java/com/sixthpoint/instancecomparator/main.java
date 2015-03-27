package com.sixthpoint.instancecomparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author sixthpoint
 */
public class main {

    public static void main(String[] args) {

        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat("1", "small"));
        cats.add(new Cat("32", "small"));

        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog("3", "small"));
        dogs.add(new Dog("5", "small"));

        List<Object> objects = new ArrayList<>();

        objects.addAll(cats);
        objects.addAll(dogs);

        Collections.sort(objects, new Comparator<Object>() {
            @Override
            public int compare(Object m1, Object m2) {
                String d1 = null;
                String d2 = null;

                if (m1 instanceof Cat) {
                    d1 = ((Cat) m1).getName();
                } else {
                    d1 = ((Dog) m1).getName();
                }

                if (m2 instanceof Cat) {
                    d2 = ((Cat) m2).getName();
                } else {
                    d2 = ((Dog) m2).getName();
                }

                return d1.compareTo(d2);
            }
        });

        for (Object o : objects) {
            if (o instanceof Cat) {
                System.out.println("Name: " + ((Cat) o).getName());
            } else {
                System.out.println("Name: " + ((Dog) o).getName());
            }
        }

    }

}
