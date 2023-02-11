package org.patterns.SOLID.OpenClose;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Stream;

public class Filter<T> {

    public Stream<T> doFilter(List<T> items, Predicate<T> predicate){
        return items.stream().filter(predicate);
    }
}
