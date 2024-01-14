package com.springjpadata;

public class TestController {
    public static final Integer ONE =  Integer.valueOf(1);
    public static final String ONE_STRING = "1";
    private Integer myInteger;
    private String myString;
    public boolean validate() {
        System.out.println(ONE);
        if(myString.equals(ONE_STRING)) {
            System.out.println("String are equal");
            System.out.println("Pull Request 1 update 17");
        }
        if(myInteger.equals(ONE)) {
            System.out.println("Equals");
            return false;
        } else {
            return true;
        }
    }
}
