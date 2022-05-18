package diceRoll;

import org.junit.Test;
import org.mockito.Mockito;

import static org.junit.Assert.*;

public class PlayerTest {

    @Test
    public void loss_player_roll_dice(){
        Dice dice = Mockito.mock(Dice.class);
        Mockito.when(dice.roll()).thenReturn(1);
        Player player = new Player(dice,3);
        assertFalse(player.play());
    }

    @Test
    public void win_player_roll_dice(){
        Dice dice = Mockito.mock(Dice.class);
        Mockito.when(dice.roll()).thenReturn(6);
        Player player = new Player(dice,3);
        assertTrue(player.play());
    }

}