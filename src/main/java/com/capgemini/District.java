package com.capgemini;

//District is a sub class from Contestant
public class District extends Contestant {

    //attributes
    private int drive; //needs to be added to defense

    //constructor including super
    public District(int playerId, boolean isAlive, int health, Gender gender, int attack, int defense, int drive) {
        super(playerId, isAlive, health, gender, attack, defense);
        this.drive = drive;
    }

    //getters and setters

    public int getDrive() {
        return drive;
    }

    public void setDrive(int drive) {
        this.drive = drive;
    }
}
