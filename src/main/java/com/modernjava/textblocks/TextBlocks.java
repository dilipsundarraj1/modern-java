package com.modernjava.textblocks;

import java.util.Arrays;

public class TextBlocks {


    public static  String multiLineString(){

        return  "This is ia multiline\n" +
                "String";
    }

    public static String multiLineStringV2(){

        return  """
                This is a multiLine 
                String
                """;
    }

    public static void main(String[] args) {

        System.out.println("multiLineString = " + multiLineString());
        System.out.println("multiLineStringV2 = " + multiLineStringV2());

    }


}
