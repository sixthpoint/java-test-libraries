package com.sixthpoint.instancecomparator;

import java.util.Date;

/**
 *
 * @author sixthpoint
 */
public class Dog extends Animal {

    private Date dob;

    public Dog(String name, Date date) {
        setDob(date);
        setName(name);
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    public Date getDob() {
        return this.dob;
    }

    public void setDob(Date date) {
        this.dob = date;
    }

}
