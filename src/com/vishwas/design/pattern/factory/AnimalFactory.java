package com.vishwas.design.pattern.factory;

public class AnimalFactory {

    enum AnimalType {
        CAT,DOG;
    }

    public static Animal getAnimal(AnimalType animalType)
    {
        if(animalType == null){
            return  null;
        }
        else if(animalType == AnimalType.CAT){
            return new Cat();
        }
        else if(animalType == AnimalType.DOG){
            return new Dog();
        }
        return null;
    }
}
