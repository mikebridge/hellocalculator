package hellocalculator;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.MatcherAssert.*;
//import static org.junit.Assert.assertThat;


/**
 * Created by bridge on 4/19/15.
 */
public class HelloCalculatorTest {

    @org.junit.Test
    public void testSum() throws Exception {
        assertThat(HelloCalculator.sum(new String[] { "23", "17", "5" }), equalTo(45));
    }
}