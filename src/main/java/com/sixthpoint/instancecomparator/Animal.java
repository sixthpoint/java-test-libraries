package com.sixthpoint.instancecomparator;

/**
 *
 * @author sixthpoint
 */
public abstract class Animal {

    /**
     * All animals must have a name
     */
    protected String name;

    public abstract String getName();

    public abstract void setName(String name);

}
