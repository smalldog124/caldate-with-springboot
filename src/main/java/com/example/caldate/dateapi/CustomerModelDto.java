package com.example.caldate.dateapi;

public class CustomerModelDto {
    private String firsname;
    private  String lastname;
    private int age;
    private String birthyear;

    public CustomerModelDto() {
    }

    public String getFirsname() {
        return firsname;
    }

    public void setFirsname(String firsname) {
        this.firsname = firsname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBirthyear() {
        return birthyear;
    }

    public void setBirthyear(String birthyear) {
        this.birthyear = birthyear;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public CustomerModelDto(String firsname, String lastname) {
        this.firsname = firsname;
        this.lastname = lastname;
    }
}
