package diceRoll;

public class Dice {

    private final Integer sides;

    public Dice(Integer sides) {
        this.sides = sides;
    }

    public Integer roll() {
        return (int) (Math.random() * sides) + 1;
    }
}
