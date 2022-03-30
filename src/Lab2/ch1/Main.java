package Lab2.ch1;


import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Fighter fighter1 = new Fighter(100, 10, "Ionut");
        Fighter fighter2 = new Fighter(120, 8, "Andrei");
        BoxingMatch bn = new BoxingMatch(fighter1, fighter2);

        Fighter winner = bn.fight();
        System.out.println("Winner=" + winner.getName());
    }
    }
