package com.example.aar_lib;

public class FooLibJavaOuter {

    public String foo(String str) {
        if (str.equals("1")) {
            return "1 block";
        } else if (str.equals("2")) {
            return "2 block";
        } else {
            return "Else block";
        }
    }
}
