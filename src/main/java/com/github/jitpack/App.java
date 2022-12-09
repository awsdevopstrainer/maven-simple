package com.github.jitpack;
import java.lang;

/**
 * Hello world! test
 *
 */
public class App 
{
    public static void main(String[] args)
    {
        System.out.println(new App().greet("world"));
    }

    public String greet(String name) {
        return "Hello " + name;
    }
}
