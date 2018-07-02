package com.obss.exception;

public class CheckedExceptionTest {

    public static void main(String[] args) {
        runScenario1();
    }

    public static void throwCheckedException() throws CheckedException {
        throw new CheckedException();
    }

    public static void throwRuntimeException(){
        throw new UncheckedException();
    }

    public static void runScenario1() {
        try {
            throwCheckedException();
        } catch (CheckedException e) {
            throw new UncheckedException(e);
        }
    }


    public static void exceptionUsage() {
        CheckedException checkedException = new CheckedException();
        try {
            throw checkedException;
        } catch(CheckedException ex){

        } catch(Exception ex){

        }

        // Syntax for catching multiple exceptions
        try {
            throw new CheckedException();
        } catch(CheckedException | RuntimeException ex) {

        }


        // This is true
        boolean deger = false || true;
        // This is false
        boolean deger2 = false || false;

        // This is false
        boolean deger3 = true && false;

        // This is true
        boolean deger4 = true && true;
    }
}
