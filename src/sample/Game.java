package sample;

import sample.mobs.Mob;
import sample.mobs.Player;
import sample.mobs.Enemy;

public class Game {
    public static void main(String[] args) {
        testCalculation(new Enemy());
        testCalculation(new Player());
    }

    public static void testCalculation(Mob mob) {
        System.out.println("Tests with mob.");
        mob.increaseDamage();
        mob.printStatus();

        System.out.println("Tests with advanced settings.");
        mob.revive();
        mob.increaseHitPoints();
        mob.increaseDamage();
        mob.upgrade();
        mob.printStatus();
    }
}
