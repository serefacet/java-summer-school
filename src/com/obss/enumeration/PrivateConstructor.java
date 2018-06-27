package com.obss.enumeration;

public class PrivateConstructor {

    private static final PrivateConstructor object = new PrivateConstructor();

    private PrivateConstructor() {

    }


    public static PrivateConstructor getObject() {
        return object;
    }
}
