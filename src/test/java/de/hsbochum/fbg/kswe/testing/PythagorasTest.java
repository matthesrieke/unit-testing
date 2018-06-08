
package de.hsbochum.fbg.kswe.testing;

import org.junit.Test;
import org.junit.Assert;

/**
 *
 * @author <a href="mailto:m.rieke@52north.org">Matthes Rieke</a>
 */
public class PythagorasTest {
    
    @Test
    public void testCalcuation() {
        double result = new Pythagoras().calculateHypothenuse(2, 3);
        Assert.assertEquals(result, 3.606, 0.001);
    }
    
}
