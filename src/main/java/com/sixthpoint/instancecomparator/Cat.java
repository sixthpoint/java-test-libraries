package com.sixthpoint.instancecomparator;

import java.util.Date;

/**
 *
 * @author sixthpoint
 */
public class Cat extends Animal {

    private Date dob;

    public Cat(String name, Date dob) {
        setDob(dob);
        setName(name);
    }

    public Date getDob() {
        return this.dob;
    }

    public void setDob(Date date) {
        this.dob = date;
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
