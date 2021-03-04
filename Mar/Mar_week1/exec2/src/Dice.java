public class Dice {
    private int dicePoint;

    public Dice() {
        roll();
    }

    public int roll(){
        setDicePoint((int) (Math.random() * 6 + 1));
        return getDicePoint();

    }

    public int getDicePoint() {
        return dicePoint;
    }

    public void setDicePoint(int dicePoint) {
        this.dicePoint = dicePoint;
    }

    public void printDicePoint() {
        System.out.println("點數:" + String.valueOf(getDicePoint()));
    }
}
