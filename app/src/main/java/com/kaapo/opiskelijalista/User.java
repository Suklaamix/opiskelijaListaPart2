package com.kaapo.opiskelijalista;

import java.io.Serializable;

public class User implements Serializable {
    protected String name;
    protected String lastName;
    protected String email;
    protected String degreeProgram;

    public User(String name, String lastName, String email, String program){
        this.name = name;
        this.lastName = lastName;
        this.email = email;
        this.degreeProgram = program;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String surname) {
        this.lastName = surname;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDegreeProgram(String program) {
        this.degreeProgram = program;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getDegreeProgram() {
        return degreeProgram;
    }

}
