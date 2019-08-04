package com.learning;
public abstract class ExtendOnce {
    public static class Subclass extends ExtendOnce {

    }

    public static class SubSubclass extends Subclass {

    }

    protected ExtendOnce() {
        if (!getClass().getSuperclass().equals(ExtendOnce.class)) {
            throw new RuntimeException(
                    "You extended this class more than once!");
        }
    }

    public static void main(String[] args) {
        System.out.println(new Subclass());
        System.out.println(new SubSubclass()); // throws exception
    }
}