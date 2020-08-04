package com.morris.AdvancedJava;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Person person1 = new Person();
        person1.setFirstName("Wali");
        System.out.println(person1.getFirstName());
        person1.setLastName("Morris");
        System.out.println(person1.getFirstName() + " " + person1.getLastName());
        Person person2 = new Person("James", "Harden");
        System.out.println(person2.getFirstName() + " " + person2.getLastName()); 
        Person person3 = person1.clone();
        System.out.println(person3.getFirstName());
        System.out.println(person1.getHashCode());
        System.out.println(person2.getHashCode());
        System.out.println(person3.getHashCode());
        boolean arePeopleSame = person1.equals(person2);
        System.out.println("Person1 and Person2 are the same: " + arePeopleSame);
        System.out.println(person1.toString());
        person1.talk();
        Dog snoopie = new Dog("Snoopie", "Dalmation");
        snoopie.talk();

        // Using generics, we will test the CapsuleContainer class which should only except a Person Object
        Person[] astronauts = { new Person("Buzz", "Lightyear"), new Person("Neil", "ArmString") };
        CapsuleContainer<Person> capsule = new CapsuleContainer<>();
        for ( Person p : astronauts ) {
            capsule.addCrewMember(p);
        }
        capsule.revealCrew();

        // The above code compiled, now let's see if we can create a CapsuleContainer of Dogs
        Dog[] puppies = { new Dog("Buddy", "GoldenRetriever"), new Dog("Sheba", "Boxer")};
        CapsuleContainer<Dog> dogCapsule = new CapsuleContainer<>();
        for ( Dog d : puppies ) {
            dogCapsule.addCrewMember(d);
        }
        dogCapsule.revealCrew();

        // both containers passed, let's try to add dogs to a capsule of people
        // CapsuleContainer<Person> capsuleMeantForPeople = new CapsuleContainer<>();
        // for ( Dog doggy: puppies ) {
        //    capsuleMeantForPeople.addCrewMember();
        //}
        // capsuleMeantForPeople.revealCrew();
        // As expected the test fails because we promised a capsule of people and received Dogs

        // lets force a runtime exception by adding 4 more people to the Person capsule. As expected, because
        // capsule capacity was reached, there was a runtime error. Commenting out one astronaut and changing
        // astronauts2 array to max length of 5 in order to fit capacity and run again.
        Person[] astronauts2 = Arrays.copyOf(astronauts, 5);
        astronauts2[2] = new Person("Elon", "Musk");
        astronauts2[3] = new Person("Uncle Bob", "Martin");
        astronauts2[4] = new Person("Kayne", "West");
        //astronauts2[5] = new Person("Bolo", "Yeung");
        capsule.releaseCapsuleManifest();
        for ( Person p : astronauts2 ) {
            capsule.addCrewMember(p);
        }
        capsule.revealCrew();
    }

}
