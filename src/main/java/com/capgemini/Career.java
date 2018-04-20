package com.capgemini;

public class Career extends Contestant {

    //attributes
    private int training; //needs to be added to attack
    //starts with a BattleItem, put a (random) item of the list

    //constructor including super
    public Career(int playerId, boolean isAlive, int health, Gender gender, int attack, int defense, int training) {
        super(playerId, isAlive, health, gender, attack, defense);
        this.training = training;
    }

    //getters and setters

    public int getTraining() {
        return training;
    }

    public void setTraining(int training) {
        this.training = training;
    }
}
