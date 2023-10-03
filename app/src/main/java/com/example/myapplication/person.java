package com.example.myapplication;

public class person {
    int Image;
    String Name;
    String Des;
    // after this click right generator->constructor and select this three
    public person(int image, String name, String des) {
        Image = image;
        Name = name;
        Des = des;
    }
    // after this click right generator-> getter and setter
    public int getImage() {
        return Image;
    }

    public void setImage(int image) {
        Image = image;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public String getDes() {
        return Des;
    }

    public void setDes(String des) {
        Des = des;
    }

}
