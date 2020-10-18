package PRACTICE7;

import java.util.Queue;

public class Queuee {

    public static String act(Queue<Integer> playerOne, Queue<Integer> playerTwo) {

        for (int k = 0; k < 106; k++) {

            if (playerOne.size() == 0) {
                return "second " + "in " + k + " moves";
            } else if (playerTwo.size() == 0) {
                return "first " + "in " + k + " moves";
            }

            else {
                Integer p1Card = playerOne.peek();
                Integer p2Card = playerTwo.peek();
                playerOne.poll();
                playerTwo.poll();

                if (p1Card != 0 && p2Card != 0) {
                    if (p1Card > p2Card) {
                        playerOne.add(p1Card);
                        playerOne.add(p2Card);
                    } else {
                        playerTwo.add(p2Card);
                        playerTwo.add(p1Card);
                    }
                }

                else if (p1Card == 9 || p2Card == 9) {
                    if (p1Card == 0) {
                        playerOne.add(p1Card);
                        playerOne.add(p2Card);
                    } else {
                        playerTwo.add(p2Card);
                        playerTwo.add(p1Card);
                    }
                }
            }
        }
        return "botva";
    }
}