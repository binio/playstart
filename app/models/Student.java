package models;

/**
 * Created by tomasz.biniecki on 22/09/2017.
 */

public class Student {
    private String firstName;
    private String lastName;
    private int age;
    private int id;

    // standard constructors, getters and setters

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
