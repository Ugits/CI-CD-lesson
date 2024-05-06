package com.jonas.mini;

public class MyClass {

    public String toNameFormat(String input) {
        if (!input.matches("[a-öA-Ö\\s]+")) return null;
        return input.substring(0, 1).toUpperCase() + input.substring(1).toLowerCase();
    }

}
