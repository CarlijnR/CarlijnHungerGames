package com.capgemini;

public class ContestantController {
    //Initiated all the players
    Contestant playerDistrict1 = new District(1, true, 100, Gender.male, 100, 18, 2);
    Contestant playerDistrict2 = new District(2, true, 100, Gender.male, 32, 18, 12);
    Contestant playerDistract3 = new District(3, true, 100, Gender.male, 43, 72, 4);
    Contestant playerDistrict4 = new District(4, true, 100, Gender.male, 22, 11, 87);
    Contestant playerDistract5 = new District(5, true, 100, Gender.male, 55, 78, 4);
    Contestant playerDistrict6 = new District(6, true, 100, Gender.male, 53, 32, 14);
    Contestant playerDistract7 = new District(7, true, 100, Gender.male, 88, 28, 45);
    Contestant playerDistrict8 = new District(8, true, 100, Gender.male, 3, 25, 8);
    Contestant playerDistract9 = new District(9, true, 100, Gender.male, 66, 21, 9);
    Contestant playerDistract10 = new District(10, true, 100, Gender.female, 24, 21, 9);
    Contestant playerDistract11 = new District(11, true, 100, Gender.female, 66, 55, 2);
    Contestant playerDistract12 = new District(12, true, 100, Gender.female, 88, 2, 47);
    Contestant playerDistract13 = new District(13, true, 100, Gender.female, 67, 25, 65);
    Contestant playerDistract14 = new District(14, true, 100, Gender.female, 73, 75, 87);
    Contestant playerDistract15 = new District(15, true, 100, Gender.female, 22, 74, 55);
    Contestant playerDistract16 = new District(16, true, 100, Gender.female, 6, 69, 23);
    Contestant playerDistract17 = new District(17, true, 100, Gender.female, 47, 11, 88);
    Contestant playerDistract18 = new District(18, true, 100, Gender.female, 56, 8, 4);
    Contestant playerCareer19 = new Career(19, true, 100, Gender.male, 55, 26, 24);
    Contestant playerCareer20 = new Career(20, true, 100, Gender.male, 2, 5, 59);
    Contestant playerCareer21 = new Career(21, true, 100, Gender.male, 54, 47, 57);
    Contestant playerCareer22 = new Career(22, true, 100, Gender.female, 53, 35, 13);
    Contestant playerCareer23 = new Career(23, true, 100, Gender.female, 24, 22, 5);
    Contestant playerCareer24 = new Career(24, true, 100, Gender.female, 98, 58, 78);


    //Make a list for all the the players
    Contestant[] allContestants = {
            playerDistrict1, playerDistrict2, playerDistract3, playerDistrict4, playerDistract5, playerDistrict6, playerDistract7, playerDistrict8, playerDistract9, playerDistract10, playerDistract11,
            playerDistract11, playerDistract12, playerDistract13, playerDistract14, playerDistract15, playerDistract16, playerDistract17, playerDistract17, playerDistract18, playerCareer19,
            playerCareer20, playerCareer21, playerCareer22, playerCareer23, playerCareer24
    };

    //methods

    //A method so that a list of the contestants can be printed
    public void printContestants() {
        System.out.println("The contestants participating are:");
        for (int i = 0; i < allContestants.length; i++) {
            System.out.println(allContestants[i].getPlayerId());
        }
        System.out.println("Wish them all a good battle.");
    }

    //Create a method where all the District players are created, when completed do the same for Career
//    public void createDistrict(Contestant[] playersDistrict) {
//        for (int i = 0; i < playersDistrict.length; i++);
//        .add();
//    }


}
