package com.obss.initializer;

import com.mysql.cj.util.StringUtils;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class InitializationTest {


    static {
        System.out.println("Static init block");
    }

    {
        System.out.println("init block");
    }

    public InitializationTest() {
        System.out.println("Default Constructur");
    }

    public static void main(String[] args) throws ClassNotFoundException {
        new InitializationTest();
        new InitializationTest();
        new InitializationTest();
        new InitializationTest();

        Class<?> aClass = Class.forName("com.mysql.jdbc.Driver");

    }
}
