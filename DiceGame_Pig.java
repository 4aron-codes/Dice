import java.util.Scanner;

public class DiceGame_Pig {
    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);

        int Player1_Sum = 0;
        int Player2_Sum = 0;

        System.out.print("Type your name: ");
        String player1_name = scnr.next();

        System.out.print("Type your name: ");
        String player2_name = scnr.next();

        System.out.println("The Game starts with " + player1_name + " and " + player2_name);

        player1 p1 = new player1();
        player2 p2 = new player2();

        while (Player1_Sum < 100 && Player2_Sum < 100) {
            System.out.println();
            System.out.println(player1_name + "'s turn. Choose 'r' or 's': ");
                if (scnr.next().equals("r")) {
                    p1.set(player1_name, player2_name, Player1_Sum);
                    Player1_Sum += p1.p1_roll();
                }
                else if (scnr.next().equals("s")) {
                    p1.p1_stop();
                }
            System.out.println();
            System.out.println(player2_name + "'s turn. Choose 'r' or 's': ");
                if (scnr.next().equals("r")) {
                    p2.set(player1_name, player2_name, Player2_Sum);
                    Player2_Sum += p2.p2_roll();
                }
                else if (scnr.next().equals("s")) {
                    p2.p2_stop();
                }
        }

        if (Player1_Sum >= 100) {
            System.out.println(player1_name + " win");
        }
        else if (Player2_Sum >= 100) {
            System.out.println(player2_name + " win");
        }
    }
    
}
