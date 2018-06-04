package com.example.valary.val_coffee;

public class Player {
    private String name;
    private String nationality;
    private String height;
    private int age;
    private String weight;

    

    public Player(String name, String nationality, String height, int age, String weight) {
        this.name = name;
        this.nationality = nationality;
        this.height = height;
        this.age = age;
        this.weight = weight;
    }

    public String scoreGoal(){
        return "4";
    }
}
