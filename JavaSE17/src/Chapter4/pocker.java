package Chapter4;

import java.util.Arrays;

public class pocker {

    public static void main(String[] args) {
        int[] Poker = new int[52];
        Solution sol = new Solution();
        System.out.println(Arrays.toString(sol.shufflePoker(Poker)));
    }

    static class Solution {
        public int[] shufflePoker(int Poker[]) {
            int temp = 0;
            boolean is;
            for (int i = 0; i < Poker.length; i++) {
                do {
                    is = false;
                    temp = (int) (Math.random() * 52);
                    for (int j = 0; j < i; j++) {
                        if (Poker[j] == temp) {
                            is = true;
                            break;
                        }
                    }
                } while (is);
                Poker[i] = temp;
            }
            return Poker;
        }
    }
}
