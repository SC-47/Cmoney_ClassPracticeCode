public class IsSmallerWin implements WinningRule{
    @Override
    public int winRound(int[] player1, int[] player2) {
        int sum = 0;
        for (int i =0; i < player1.length;i++){
            sum += player1[i]-player2[i];
        }
        if (sum < 0){
            return 1;
        }else if(sum > 0){
            return -1;
        }else{
            return 0;
        }
    }
}
