package com.HarshSaxena;

public class Main {

    public static void main(String[] args) {
	// write your code here
   /*     Player player = new Player();
        player.name = "Harsh";
        player.health = 20;
        player.weapon = "sword";

        int damage = 10;
        player.loseHealth(10);
        System.out.println("Remaining health is " + player.remainingHealth());

        player.loseHealth(11);
        System.out.println("Remaining health is " + player.remainingHealth());*/

        EnhancedPlayer player = new EnhancedPlayer("Harsh", 50, "sword");
        
        System.out.println("Health of the player  is " + player.getHealth());
    }
}
