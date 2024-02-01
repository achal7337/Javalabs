/**
 * NAME: ACHAL GANDHI
 * STUDENT NO: 21831911
 *
 *
 *
 *
 *
 * EECS 2011 A, Fall 2022.
 * Assignment 2, Question 2 starter code.
 * Please read carefully the instructions in the assignment handout
 * and the starter code.
 */
import java.util.ArrayList;
// DO NOT ADD ANY package
// DO NOT ADD ANY import
/**
 * The A2Q2 class
 */
public class A2Q2 {

    /**
     * A class representing a single move in the TOH solution,
     * i.e., moving the disk at the top of fromPeg to the top of toPeg
     * Note: a move is invalid if it results in a larger disk being above a smaller disk.
     * DO NOT MODIFY THIS CLASS.
     */
    static class Move {

        private final int fromPeg;
        private final int toPeg;

        public Move(int from, int to) {
            this.fromPeg = from;
            this.toPeg = to;
        }

        public String toString() {
            return String.format("%d to %d", this.fromPeg, this.toPeg);
        }
    }

    /**
     * Return the sequence of moves that solves the 3-peg TOH problem with n disks.
     * Assumptions:
     * - The pegs are numbered 1, 2, 3
     * - The origin peg is 1.
     * - The destination peg is 2.
     * - n > 0
     */


    public static ArrayList<Move> threePegTOH(int n) {
    return helper(n,1,3,2);

    }

     static ArrayList<Move> helper(int n, int a, int b, int c){
      ArrayList m = new ArrayList();
        if (n>=1){
            helper(n-1,a,c,b);
            Move move = new Move(a,c);
            m.add(move.toString());
            helper(n-1,b,a,c);
        }

        return m;
    }


    /**
     * Return the sequence of moves that solves the 4-peg TOH problem with n disks,
     * with the strategy described in the assignment handout
     * Assumptions:
     * - The pegs are numbered 1, 2, 3, 4
     * - The origin peg is 1.
     * - The destination peg is 2.
     * - n > 0
     */
    public static ArrayList<Move> fourPegTOH(int n) {

        // TODO: complete this method
        return null;
    }

    public static void main(String[] args) {

        System.out.println(threePegTOH(5));
        System.out.println(fourPegTOH(5));
    }
}
