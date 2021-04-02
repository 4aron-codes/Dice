import java.util.Random;
import java.util.Scanner;

public class player1 {
    Random rand = new Random();
    Scanner scnr = new Scanner(System.in);
    private int DiceNum1;
    private int sum;
    private int currentSum;
    String player1_name;
    String player2_name;
    private int lastSum;

    public player1() {
        DiceNum1 = 0;
        sum = 0;
    }

    public void set(String player1_name, String player2_name, int currentSum) {
        this.player1_name = player1_name;
        this.player2_name = player2_name;
        this.currentSum = currentSum;
        lastSum = currentSum;
        }

    public int p1_roll() {
        String a = "r";
        sum = 0;
        while (a.equals("r")) {
            DiceNum1 = rand.nextInt(6)+1;
            sum += DiceNum1;
            currentSum += DiceNum1;
                if (DiceNum1 == 1) {
                    currentSum -= sum;
                    System.out.println();
                    System.out.println(player1_name + " rolled: 1. " + player1_name + "'s rolls at this turn are lost. " + player1_name + "'s sum: " + lastSum + "\n");
                    System.out.println("Turn goes to " + player2_name + ".");
                    sum = 0;
                    break;
                }
                else{
                    System.out.println();
                    System.out.println(player1_name + " rolled: " + DiceNum1 + " Current " + player1_name + "'s Sum: " + currentSum);
                    System.out.println("Choose 'r' or 's': ");
                    a = scnr.next();
                }
        }
        if (a.equals("s")) {
            p1_stop();
        }
    return sum;
    }

    public void p1_stop() {
        System.out.println();
        System.out.println(player1_name + " has chosen stop. Turn goes to " + player2_name + ".");
    }
}