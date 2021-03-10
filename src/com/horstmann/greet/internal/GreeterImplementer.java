package com.horstmann.greet.internal;

import com.horstmann.greet.Greeter;

public class GreeterImplementer implements Greeter {
    public String greet(String subject) {
        return "Hello, " + subject + "!";
    }
}
