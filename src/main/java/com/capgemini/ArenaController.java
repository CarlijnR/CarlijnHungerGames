package com.capgemini;

public class ArenaController {

    //fight other contestant
    //step 1: random select 2 contestants
    //step 2: random select which player hits first
    //step 3: if attack of first contestant is higher than the second win, otherwise he loses
    //step 3a: later on: make calculation with attack and defense
    //step 4: contestant who has lost dies
    //step 4a: later on contestant who wins can also lose health and maybe gains a level

    ContestantController hungerGames = new ContestantController();

    public void fightContestant(){
        if (hungerGames.playerCareer19.getAttack() > hungerGames.playerCareer21.getAttack()) {
            hungerGames.playerCareer21.isDead();
            hungerGames.playerCareer19.isLiving();
        } else{
            hungerGames.playerCareer19.isDead();
            hungerGames.playerCareer21.isLiving();
        }
    }



}
