package com.solarexsoft.designpatterns.simplefactory;

/**
 * Created by houruhou on 01/06/2017.
 */
public class KArmy implements Army{
    public static final String DESCRIPTION = "This is KArmy";
    @Override
    public String getDescription() {
        return DESCRIPTION;
    }
}
