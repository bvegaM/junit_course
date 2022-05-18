package utils;
import enums.SecurityLevel;
import org.junit.Test;

import static org.junit.Assert.*;

public class UtilTest {

    @Test
    public void weak_when_less_than_eight() {
        assertEquals(SecurityLevel.WEAK, Util.validatePassword("1234567"));
    }

    @Test(expected = IllegalArgumentException.class)
    public void empty_password_throws_exception(){
        Util.validatePassword("");
    }

    @Test(expected = IllegalArgumentException.class)
    public void null_password_throws_exception(){
        Util.validatePassword(null);
    }


}