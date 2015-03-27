package com.sixthpoint.instancecomparator;

/**
 *
 * @author sixthpoint
 */
public class Cat extends Animal {

    public Cat(String name, String size) {
        setSize(size);
        setName(name);
    }

    @Override
    public String getSize() {
        return this.size;
    }

    @Override
    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

}
