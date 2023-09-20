package com.modernjava.patternmatching.recordMatch;

public class AnimalService {

    public String retrieveName(Animal animal){
        return switch (animal){
            case null -> ""; // This handles the null pointer exception.
            case Cat cat -> cat.name();
            case Dog dog -> dog.name();
        };

    }

    public String retrieveNameV2(Animal animal){
        return switch (animal){
            case null -> "";  // This handles the null pointer exception.
//            case Car(String name,
//                     String color) -> name;
            //type inference can also be used in the binding variable.
            case Cat(var name,
                     var color) -> name;
            case Dog(String name,
                     String color) -> name;
        };

    }


}
