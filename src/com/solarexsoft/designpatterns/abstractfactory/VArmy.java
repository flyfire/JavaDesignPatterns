package com.solarexsoft.designpatterns.abstractfactory;

/**
 * Created by houruhou on 01/06/2017.
 */
public class VArmy implements Army {
    public static final String DESCRIPTION = "This is VArmy";
    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
