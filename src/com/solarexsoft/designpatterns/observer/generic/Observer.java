package com.solarexsoft.designpatterns.observer.generic;

/**
 * Created by houruhou on 03/06/2017.
 */
public interface Observer<S extends Observable<S, O, A>, O extends Observer<S, O, A>, A> {
    void update(S subject, A argument);
}
