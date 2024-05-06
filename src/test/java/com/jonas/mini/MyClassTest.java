package com.jonas.mini;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;


class MyClassTest {

    static MyClass test;

    @BeforeAll
    public static void initTestObject() {
        test = new MyClass();
    }

    @Test
    public void isFirstLetterUpper() {
        assertEquals("Aldoinen", test.toNameFormat("alDOINen"));
    }

    @Test
    public void isReturnNull() {
        assertNull(test.toNameFormat(""));
    }

    @Test
    public void  isAlphabetical() {
        assertNull(test.toNameFormat("6dfbvd84@., seö+651kn"));
    }
    
}