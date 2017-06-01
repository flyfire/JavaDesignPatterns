package com.solarexsoft.designpatterns.singleton;

/**
 * Created by houruhou on 01/06/2017.
 */
public final class InitalizingOnDemandHolder {
    private InitalizingOnDemandHolder() {
    }

    public static InitalizingOnDemandHolder getInstance() {
        return Holder.INSTANCE;
    }

    public static class Holder {
        public static final InitalizingOnDemandHolder INSTANCE = new InitalizingOnDemandHolder();
    }
}
