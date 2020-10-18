package PRACTICE7;

import java.util.Stack;

public class Stackk {

    public static Stack<Integer> layDown(Stack<Integer> stack, Integer p1Card, Integer p2Card) {
        Stack<Integer> temp = new Stack<>();
        while (!stack.empty()) {
            temp.push(stack.pop());
        }
        Stack<Integer> result = new Stack<Integer>();
        result.push(p1Card);
        result.push(p2Card);
        while (!temp.empty()) {
            result.push(temp.pop());
        }
        return result;
    }

    public static String act(Stack<Integer> playerOne, Stack<Integer> playerTwo) {

        for (int k = 0; k < 106; k++) {

            if (playerOne.size() == 0) {
                return "second " + "in " + k + " moves";
            } else if (playerTwo.size() == 0) {
                return "first " + "in " + k + " moves";
            }

            else {
                Integer p1Card = playerOne.peek();
                Integer p2Card = playerTwo.peek();
                playerOne.pop();
                playerTwo.pop();

                if (p1Card != 0 && p2Card != 0) {
                    if (p1Card > p2Card) {
                        playerOne = layDown(playerOne, p1Card, p2Card);
                    } else {
                        playerTwo = layDown(playerTwo, p2Card, p1Card);
                    }
                }

                else if (p1Card == 9 || p2Card == 9) {
                    if (p1Card == 0) {
                        playerOne = layDown(playerOne, p1Card, p2Card);
                    } else {
                        playerTwo = layDown(playerTwo, p2Card, p1Card);
                    }
                }
            }
        }
        return "botva";
    }
}
