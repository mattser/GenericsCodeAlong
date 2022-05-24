package com.nology;

import java.util.Arrays;

public class PersonQueue {

    private Person[] personArray;

    public PersonQueue() {
        this.personArray = new Person[0];
    }

    public void add(Person person) {

        personArray = Arrays.copyOf(personArray, personArray.length+1);
        personArray[personArray.length-1] = person;

    }

    public Person dequeue() {
        Person returnPerson = personArray[0];
        personArray = Arrays.copyOfRange(personArray,1, personArray.length);
        return returnPerson;
    }

    public void printPersonQueue() {
        System.out.println("Person Queue [");
        for (Person person: personArray) {
            System.out.println(person);
        }
        System.out.println("]");
    }


}
