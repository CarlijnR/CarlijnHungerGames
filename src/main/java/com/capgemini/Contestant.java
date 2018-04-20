package com.capgemini;

public class Contestant {

    //attributes
    private int playerId;
    private boolean isAlive;
    private int health = 100;
    private Gender gender;
    private int attack;
    private int defense;

    //constructor
    public Contestant(int playerId, boolean isAlive, int health, Gender gender, int attack, int defense) {
        this.playerId = playerId;
        this.isAlive = isAlive;
        this.health = health;
        this.gender = gender;
        this.attack = attack;
        this.defense = defense;
    }

    //methods
    //fight other contestant

    /*public void fightContestant() {
        if
    }*/

    //check if alive or dead - if else
    public void isAlive() {
        if (health < 0) {
            isAlive = false;
            System.out.println(Contestant.this.playerId + "has died during the fight");
        } else {
            isAlive = true;
            System.out.println(Contestant.this.playerId + "is still alive");
        }
    }


    //getters and setters
}