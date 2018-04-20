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

    public void isDead() {
        isAlive = false;
        System.out.println("The player " + this.getPlayerId() + " is dead. Game over.");
    }

    public void isLiving(){
        isAlive = true;
        System.out.println("The player " + this.getPlayerId() + " is alive. Who will he/she kill next?");
    }

    //getters and setters

    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }

    public int getDefense() {
        return defense;
    }

    public void setDefense(int defense) {
        this.defense = defense;
    }
}