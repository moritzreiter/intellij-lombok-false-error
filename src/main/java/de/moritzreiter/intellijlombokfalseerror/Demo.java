package de.moritzreiter.intellijlombokfalseerror;

public class Demo {

    public void demo() {
        var foo1 = Foo.of("one", "two", Demo.class);
        var foo2 = Foo.of(foo1, Demo.class);
    }
}
