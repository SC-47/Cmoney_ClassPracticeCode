public class IsMoreSameWin implements WinningRule {
    @Override
    public int win(int[] player1, int[] player2) {
        int[] player1PointCount = {0, 0, 0, 0, 0, 0};
        int player1MaxCount = 0;
        int[] player2PointCount = {0, 0, 0, 0, 0, 0};
        int player2MaxCount = 0;
        for (int i = 0; i < player1.length; i++) {
            player1PointCount[player1[i] - 1]++;
            player2PointCount[player2[i] - 1]++;
        }
        for (int i = 0; i < player1PointCount.length; i++) {
            if (player1MaxCount < player1PointCount[i]) {
                player1MaxCount = player1PointCount[i];
            }
            if (player2MaxCount < player2PointCount[i]) {
                player2MaxCount = player2PointCount[i];
            }
        }
        return player1MaxCount - player2MaxCount;
    }
}
