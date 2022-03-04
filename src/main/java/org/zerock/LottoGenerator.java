package org.zerock;

import java.util.LinkedList;
import java.util.List;

public class LottoGenerator {
    public static int[] generateLotto(int numOfPicks) {
        int[] result = new int[numOfPicks];

        // 1부터 45까지 적힌 공 준비
        List<Integer> lottoBalls = new LinkedList<Integer>();
        int numOfBalls = 45;
        for (int i = 0; i < numOfBalls; i++) {
            lottoBalls.add(i + 1);
        }

        // 공을 'numOfPicks' 만큼 뽑아 'result' 에 차례로 저장한다.
        for (int i = 0; i < numOfPicks; i++) {
            // 생성할 'randomNumber'의 범위 설정 시 주의. 공을 뽑으면 총 공의 갯수가 줄어 든다.
            int randomNumber = (int) (Math.random() * numOfBalls--);
            result[i] = lottoBalls.remove(randomNumber);
        }

        /*
         * 한번 뽑힌 공은 'lottoBalls' 에서 사라지기 때문에 중복된 숫자를 뽑는 경우는 없다.
         */
        return result;
    }
}
