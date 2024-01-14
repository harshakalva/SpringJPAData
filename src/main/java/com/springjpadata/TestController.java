package com.springjpadata;

public class TestController {
    public static final Integer ONE =  Integer.valueOf(1);
    public static final String ONE_STRING = "1";
    private Integer myInteger;
    private String myString;
    public boolean validate() {
        String unusedVariable = "unused varaible";
        System.out.println(ONE);
        if(myString.equals(ONE_STRING)) {
            System.out.println("String are equal");
            System.out.println("Pull Request test 4 ");
        }
        if(myInteger.equals(ONE)) {
            System.out.println("Equals");
            return false;
        } else {
            return true;
        }
    }
}
