package diceRoll;

public class Player {

    private final Dice dice;
    private final Integer minValToWin;

    public Player(Dice dice, Integer minValToWin) {
        this.dice = dice;
        this.minValToWin = minValToWin;
    }

    public boolean play(){
        return dice.roll() >= minValToWin;
    }
}
