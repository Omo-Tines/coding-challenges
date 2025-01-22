package FizzBuzz;

import java.util.ArrayList;

public class Solution {

    public static String run(int N, int M) {
        /*
         * Generates a FizzBuzz sequence between N and M.
         */
        String sequence = "";
        ArrayList<String> seq = new ArrayList<>();
        for (int i = N; i <= M; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                seq.add("FizzBuzz");
            } else if (i % 3 == 0) {
                seq.add("Fizz");
            } else if (i % 5 == 0) {
                seq.add("Buzz");
            } else {
                seq.add(String.valueOf(i));
            }
        }

        sequence = String.join(",", seq);
        return sequence;
    }
}

