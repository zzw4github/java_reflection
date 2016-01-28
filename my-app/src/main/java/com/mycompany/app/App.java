package com.mycompany.app;

import java.lang.reflect.Field;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws ClassNotFoundException {

        Class cl = Class.forName("com.mycompany.app.Test");
        try {
            Field field =cl.getDeclaredField("int_01");
            Field field_01 =cl.getField("str_01");
            System.out.println(field_01.getName());
            System.out.println(field.getName());
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }
}
