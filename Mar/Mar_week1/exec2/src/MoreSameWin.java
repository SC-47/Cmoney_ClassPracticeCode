public class MoreSameWin implements WinningRule{

    @Override
    public int winRound(int[] player1, int[] player2) {
        int[] pointCount1 = new int[6];
        int[] pointCount2 = new int[6];
        for (int i =0; i < player1.length;i++){
            pointCount1[player1[i]-1]++;
            pointCount2[player2[i]-1]++;
        }
        int maxPointCount1 = 0;
        int maxPointCount2 = 0;
        for (int i =0; i < pointCount1.length;i++){
            if(maxPointCount1<pointCount1[i]){
                maxPointCount1=pointCount1[i];
            }
            if(maxPointCount2<pointCount2[i]){
                maxPointCount2=pointCount2[i];
            }
        }
        if (maxPointCount1>maxPointCount2){
            return 1;
        }else if(maxPointCount1<maxPointCount2){
            return -1;
        }else{
            return 0;
        }


    }
}
