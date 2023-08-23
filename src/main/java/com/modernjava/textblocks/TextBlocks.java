package com.modernjava.textblocks;

public class TextBlocks {

    public static String multiLineString() {

        var multiLine = "This is a\n" +
                "    multiline string\n" +
                "with newlines inside";

        return  multiLine;
    }


    public static String json() {

        return """
                {
                	"order_id": 123456,
                	"status": "DELIVERED",
                	"final_charge": 999.99,
                	"order_line_items": [{
                		"item_name": "iphone 14",
                		"quantity": 1
                	}]
                }
                """
                ;
    }

    public static void main(String[] args) {

    }
}
