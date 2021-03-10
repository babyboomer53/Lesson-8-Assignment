package com.horstmann.greet;

public interface Greeter {
    static Greeter newInstance() {
        return new com.horstmann.greet.internal.GreeterImplementer();
    }
    String greet(String subject);
}

