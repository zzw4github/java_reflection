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
            Field field_01 =cl.getDeclaredField("int_01"); //所有
            Field field_03 =cl.getField("int_01");//NoSuchFileException  int_01  不是 public
            Field field_02 =cl.getField("str_01");

            System.out.println(field_01.getName());
            System.out.println(field_02.getName());
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }
}
