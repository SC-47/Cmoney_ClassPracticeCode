public class IsSmallerWin implements WinningRule {
    @Override
    public int win(int[] player1, int[] player2) {
        int player1Win = 0;
        for (int i = 0; i < player1.length; i++) {
            player1Win += player1[i] - player2[i];
        }
        return -player1Win;
    }
}
