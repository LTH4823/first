package org.zerock.test;

import java.rmi.MarshalException;

public class Lotto {

    public static int[] generateLotto(int numOfPicks) {
        int[] myPicks = new int[numOfPicks];

        for (int i = 0; i < numOfPicks; i++) {
            int currentPick = getOne();
            if (chekDuplicate(i, currentPick, myPicks)) {
                i--;
                continue;
            }
            myPicks[i] = currentPick;
        }

        return myPicks;
    }

    private static int getOne() {
        return (int) (Math.random() * 45) + 1;
    }

    private static boolean chekDuplicate(int idx, int number, int[] picks) {
        boolean result = false;
        for (int i = 0; i < idx; i++) {
            if (number == picks[i]) {
                result = true;
            }
        }
        return result;
    }

}
