package com.solarexsoft.designpatterns.singleton;

/**
 * Created by houruhou on 01/06/2017.
 */
public class InitalizingOnDemandHolderTest extends SingletonTest<InitalizingOnDemandHolder> {
    public InitalizingOnDemandHolderTest(){
        super(InitalizingOnDemandHolder::getInstance);
    }
}
