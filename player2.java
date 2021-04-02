import java.util.Random;
import java.util.Scanner;

public class player2 {
    Random rand = new Random();
    Scanner scnr = new Scanner(System.in);
    private int DiceNum2;
    private int sum;
    private int currentSum;
    String player1_name;
    String player2_name;
    private int lastSum;

    public player2() {
        DiceNum2 = 0;
        sum = 0;
    }

    public void set(String player1_name, String player2_name, int currentSum) {
        this.player1_name = player1_name;
        this.player2_name = player2_name;
        this.currentSum = currentSum;
        lastSum = currentSum;
        }

    public int p2_roll() {
        String a = "r";
        sum = 0;
        while (a.equals("r")) {
            DiceNum2 = rand.nextInt(6)+1;
            sum += DiceNum2;
            currentSum += DiceNum2;
                if (DiceNum2 == 1) {
                    currentSum -= sum;
                    System.out.println();
                    System.out.println(player2_name + " rolled: 1. " + player2_name + "'s rolls at this turn are lost. " + player2_name + "'s sum: " + lastSum + "\n");
                    System.out.println("Turn goes to " + player2_name + ".");
                    sum = 0;
                    break;
                }
                else{
                    System.out.println();
                    System.out.println(player2_name + " rolled: " + DiceNum2 + " Current " + player2_name + "'s Sum: " + currentSum);
                    System.out.println("Choose 'r' or 's': ");
                    a = scnr.next();
                }
        }
        if (a.equals("s")) {
            p2_stop();
        }
    return sum;
    }

    public void p2_stop() {
        System.out.println();
        System.out.println(player2_name + " has chosen stop. Turn goes to " + player1_name + ".");
    }
}