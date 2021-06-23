import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

public class StringCalculatorTester {

    private String s;
    private StringCalculator calc;

    @BeforeEach
    public void setUp() {
        s = new String();
    }

    @AfterEach
    public void tearDown() {
        s = null;
    }

    public void setString(String str) {
        this.s = str;
    }

    //test for numbers greater than 1000 should run as a fail
    @Test
    public void testGeSubStrings9() {
        setString("1,10000,2");
        assertThrows(IndexOutOfBoundsException.class, () ->  calc.add(s));
    }

    //test for both upper & lower limit being out of bounds (lower range)
    @Test
    public void testGeSubStrings10() {
        setString("2,1,-4,5,7");
        assertThrows(IllegalArgumentException.class, () ->  calc.add(s));
    }
}
