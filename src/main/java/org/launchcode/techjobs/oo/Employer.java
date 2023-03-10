package org.launchcode.techjobs.oo;

import java.util.Objects;

public class Employer extends JobField {

//    private int id;
//    private static int nextId = 1;
//    private String value;
//
//    public Employer() {
//        id = nextId;
//        nextId++;
//    }

    //this code is shared by the baseclass-H.A

    public Employer(String value) {
        super(value);
    }

    //This was copy and pasted from assignment 5- part 6. #5

    // Custom toString, equals, and hashCode methods:

//    @Override
//    public String toString() {
//        return value;
//    }
    //Remove any of the custom methods that are identical.-H.A

    @Override
    public boolean equals(Object o) {  // Two objects are equal if they have the same id.
        if (this == o) return true;
        if (!(o instanceof Employer)) return false;
        Employer xx = (Employer) o;
        return getId() == xx.getId();
    }

//    @Override
//    public int hashCode() {
//        return Objects.hash(getId());
//    }



    //Remove any of the custom methods that are identical-H.A





    // Getters and Setters-H.A

//    public int getId() {
//        return id;
//    }
//
//    public String getValue() {
//        return value;
//    }
//
//    public void setValue(String value) {
//        this.value = value;
//    }

    //Getters/Setters shared by base class JobField-H.A
}
