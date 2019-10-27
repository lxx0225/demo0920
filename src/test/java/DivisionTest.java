import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.*;

public class DivisionTest {

    Division division = new Division();
    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void divide() {
        assertThat(division.divide(10,5),equalTo(2));
    }
    @Test
    public void divideByZero() {
        assertThat(division.divide(10,0),equalTo(2));
    }
    @Test

    public void divideReturnZero() {
        assertThat(division.divide(1,2),equalTo(0));
    }
}