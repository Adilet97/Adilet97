package com.company;

public class GameEntity {

    private int health = 500;
    private int damage = 50;
    private String typeOfDefence = "Physical";

    public int getHealth() {
        return health;
    }

    public int getDamage() {
        return damage;
    }

    public String getTypeOfDefence() {
        return typeOfDefence;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setTypeOfDefence(String typeOfDefence) {
        this.typeOfDefence = typeOfDefence;
    }
}
