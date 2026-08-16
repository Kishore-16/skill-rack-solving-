// Filling Cans - BFS Solution

import java.util.*;

public class skillrack_24 {
    // Helper class to represent the state of the two cans
    static class State {
        int c1, c2, steps;

        State(int c1, int c2, int steps) {
            this.c1 = c1;
            this.c2 = c2;
            this.steps = steps;
        }
    }

    // Helper method to find the Greatest Common Divisor
    private static int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    public static int minSteps(int X, int Y, int Z) {
        // Impossible if Z is greater than both can capacities
        if (Z > X && Z > Y) {
            return -1;
        }

        // Impossible if Z is not divisible by the GCD of X and Y
        if (Z % gcd(X, Y) != 0) {
            return -1;
        }

        // Queue for BFS and a set to keep track of visited states
        Queue<State> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();

        // Starting state: both cans are empty (0, 0) with 0 steps
        queue.add(new State(0, 0, 0));
        visited.add("0,0");

        while (!queue.isEmpty()) {
            State curr = queue.poll();

            // If target Z is reached in either can, return the step count
            if (curr.c1 == Z || curr.c2 == Z) {
                return curr.steps;
            }

            // List to store all 6 possible next transitions
            List<State> transitions = new ArrayList<>();

            // 1. Fill Can 1
            transitions.add(new State(X, curr.c2, curr.steps + 1));
            // 2. Fill Can 2
            transitions.add(new State(curr.c1, Y, curr.steps + 1));
            // 3. Empty Can 1
            transitions.add(new State(0, curr.c2, curr.steps + 1));
            // 4. Empty Can 2
            transitions.add(new State(curr.c1, 0, curr.steps + 1));

            // 5. Pour Can 1 into Can 2
            int pour1to2 = Math.min(curr.c1, Y - curr.c2);
            transitions.add(new State(curr.c1 - pour1to2, curr.c2 + pour1to2, curr.steps + 1));

            // 6. Pour Can 2 into Can 1
            int pour2to1 = Math.min(curr.c2, X - curr.c1);
            transitions.add(new State(curr.c1 + pour2to1, curr.c2 - pour2to1, curr.steps + 1));

            // Process all valid, unvisited transitions
            for (State next : transitions) {
                String stateKey = next.c1 + "," + next.c2;
                if (!visited.contains(stateKey)) {
                    visited.add(stateKey);
                    queue.add(next);
                }
            }
        }

        return -1;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Read input variables
        if (sc.hasNextInt()) {
            int X = sc.nextInt();
            int Y = sc.nextInt();
            int Z = sc.nextInt();

            // Compute and output the result
            System.out.println(minSteps(X, Y, Z));
        }
        sc.close();
    }
}
