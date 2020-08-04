package com.morris.AdvancedJava;

public class Person implements Cloneable, Talkable {
    private String firstName;
    private String lastName;
    private int hashCode;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.hashCode = this.hashCode();
    }

    public Person() {
        this(null, null);
        this.hashCode = this.hashCode();
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public int getHashCode() {
        return this.hashCode;
    }

    @Override
    public Person clone() throws CloneNotSupportedException {
        return (Person) super.clone();
    }

    @Override
    public String toString() {
        return String.format("%s %s", this.getFirstName(), this.getLastName());
    }

    @Override
    public void talk() {
        System.out.println("Say Hello my name is " + this.getFirstName() + "!");
    }
}
