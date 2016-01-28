package com.mycompany.app;

/**
 * Created by infosea on 2016/1/28.
 */
public class Test extends  TestSuper implements TestInterface{
    private int int_01 =123_123;
    public String str_01 ="string_01";

    public void m_01(){}

    @Override
    public boolean isAInterface() {
        return Boolean.FALSE;
    }

    private String m_02(){
        return "m_02";
    }
    protected static String m_03(String m){
        return "m_03";
    }




}
