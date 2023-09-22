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

//            case Car(String name,
//                     String color) -> name;
            //type inference can also be used in the binding variable.
            case Cat(var name,
                     var color) -> name;
            case Dog(String name,
                     String color) -> name;
            // The null case is must and it handles the null pointer exception.
            // It does not matter where this case statement is kept.
            case null -> "";
        };

    }


}
