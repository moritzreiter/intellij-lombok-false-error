package de.moritzreiter.intellijlombokfalseerror;

import lombok.Data;

@Data(staticConstructor = "of")
class Foo<T> {

    private final String one;
    private final String two;
    private final Class<T> type;

    static <T> Foo<T> of(Foo<?> foo, Class<T> type) {
        return new Foo<T>(foo.getOne(), foo.getTwo(), type);
    }
}
