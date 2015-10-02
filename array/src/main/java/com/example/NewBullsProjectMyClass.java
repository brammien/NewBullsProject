package com.example;

public class NewBullsProjectMyClass {

    public static void main(String[] args) {


        double[] averageScore = {951.2, 10.8, 108, 151.2, 1300, 482.4, 376.2, 592.2, 27.6, 836.4, 1443, 638.6, 432};
        double[] averageRebound = {11.8, 3.9, 2.0};

        // Print all the array elements
        for (int i = 0; i < averageScore.length; i++) {
            System.out.println(averageScore[i] + " ");
        }
        // Summing all elements
        double total = 0;
        for (int i = 0; i < averageScore.length; i++) {
            total += averageScore[i];
        }
        System.out.println("Total is " + total);
        // Finding the largest element
        double max = averageScore[0];
        for (int i = 1; i < averageScore.length; i++) {
            if (averageScore[i] > max) max = averageScore[i];
        }
        System.out.println(total/13 + " is average");

        // Print all the array elements
        for (int i = 0; i < averageRebound.length; i++) {
            System.out.println(averageRebound[i] + " ");
        }
        // Summing all elements
        double total2 = 0;
        for (int i = 0; i < averageRebound.length; i++) {
            total2 += averageRebound[i];
        }
        System.out.println("Total is " + total2);
        // Finding the largest element
        double max2 = averageRebound[0];
        for (int i = 1; i < averageRebound.length; i++) {
            if (averageRebound[i] > max2) max2 = averageRebound[i];
        }
        System.out.println(total2/3 + " is average");

        Double Min1 = 30.0;
        Double Min2 = 38.7;
        Double FGM1 = 6.6;
        Double FGM2 = 6.5;
        Double FGA1 = 16.4;
        Double FGA2 = 14.0;
        Double ThreePM1 = 1.5;
        Double ThreePM2 = 1.1;
        Double FTM1 = 3.0;
        Double FTM2 = 5.9;
        Double FTA1 = 3.7;
        Double FTA2 = 7.1;
        Double OREB1 = 0.7;
        Double OREB2 = 1.8;
        Double DREB1 = 2.5;
        Double DREB2 = 4.1;
        Double REB1 = 3.2;
        Double REB2 = 5.8;
        Double AST1 = 4.9;
        Double AST2 = 3.3;
        Double TOV1 = 3.2;
        Double TOV2 = 1.4;
        Double STL1 = 0.7;
        Double STL2 = 1.8;
        Double BLK1 = 0.3;
        Double BLK2 = 0.6;
        Double PF1 = 1.2;
        Double PF2 = 1.7;
        Double PTS1 = 17.7;
        Double PTS2 = 20.0;
        String player;

        if (Min1 >= Min2) {
            player = "Derick Rose";
        } else {
                player = "Jimmy Butler";
        }
        System.out.println("Min is higher = " + player);
        //Who's got higher Min
        if (FGM1 >= FGM2) {
            player = "Derick Rose";
        } else {
            player = "Jimmy Butler";
        }
        System.out.println("FGM is higher = " + player);
        //Who's got better FGM
        if (FGA1 >= FGA2) {
            player = "Derick Rose";
        } else {
            player = "Jimmy Butler";
        }
        System.out.println("FGA is higher = " + player);
        //Who's got better FGA
        if (ThreePM1 >= ThreePM2) {
            player = "Derick Rose";
        } else {
            player = "Jimmy Butler";
        }
        System.out.println("3PM is higher = " + player);
        //Who's got better 3PM
        if (FTM1 >= FTM2) {
            player = "Derick Rose";
        } else {
            player = "Jimmy Butler";
        }
        System.out.println("FTM is higher = " + player);
        //Who's got better FTM
        if (FTA1 >= FTA2) {
            player = "Derick Rose";
        } else {
            player = "Jimmy Butler";
        }
        System.out.println("FTA is higher = " + player);
        //Who's got better FTA
        if (OREB1 >= OREB2) {
            player = "Derick Rose";
        } else {
            player = "Jimmy Butler";
        }
        System.out.println("OREB is higher = " + player);
        //Who's got better OREB
        if (DREB1 >= DREB2) {
            player = "Derick Rose";
        } else {
            player = "Jimmy Butler";
        }
        System.out.println("DREB is higher = " + player);
        //Who's got better DREB
        if (REB1 >= REB2) {
            player = "Derick Rose";
        } else {
            player = "Jimmy Butler";
        }
        System.out.println("REB is higher = " + player);
        //Who's got better REB
        if (AST1 >= AST2) {
            player = "Derick Rose";
        } else {
            player = "Jimmy Butler";
        }
        System.out.println("AST is higher = " + player);
        //Who's got better AST
        if (TOV1 >= TOV2) {
            player = "Derick Rose";
        } else {
            player = "Jimmy Butler";
        }
        System.out.println("TOV is higher = " + player);
        //Who's got better TOV
        if (STL1 >= STL2) {
            player = "Derick Rose";
        } else {
            player = "Jimmy Butler";
        }
        System.out.println("STL is higher = " + player);
        //Who's got better STL
        if (BLK1 >= BLK2) {
            player = "Derick Rose";
        } else {
            player = "Jimmy Butler";
        }
        System.out.println("BLK is higher = " + player);
        //Who's got better BLK
        if (PF1 >= PF2) {
            player = "Derick Rose";
        } else {
            player = "Jimmy Butler";
        }
        System.out.println("PF is higher = " + player);
        //Who's got better PF
        if (PTS1 >= PTS2) {
            player = "Derick Rose";
        } else {
            player = "Jimmy Butler";
        }
        System.out.println("PTS is higher = " + player);
        //Who's got better PTS
        System.out.println("Jimmy Butler beat Derick Rose 10 out of 15 catagories");{
        System.out.println(30.0+6.6+16.4+1.5+3.0+3.7+0.7+2.5+3.2+4.9+3.2+0.7+0.3+1.2+17.7 + "is total sum of averages for Derick Rose ");
        System.out.println(38.7+6.5+14.0+1.1+5.9+7.1+1.8+4.1+5.8+3.3+1.4+1.8+0.6+1.7+20.0+ " is total sum of averages for Jimmy Butler");
        System.out.println("Based on averages Jimmy Butler beats Derick Rose.");
        }

    }

}

