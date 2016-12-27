package test.clock

import org.junit.Assert
import org.junit.Before
import org.junit.Test

import static junit.framework.Assert.assertEquals


class ClockAngleUtilTest {

    private static final double DELTA = 1e-15;

    private ClockAngleUtil clockAngleUtil;

    @Before
    public void setUp() throws Exception {
        clockAngleUtil = new ClockAngleUtil();
    }

    @Test
    public void ShouldCalculateDifferenceBetweenTwoAngle() {
       double angle= clockAngleUtil.calculateDifferenceBetweenTwoAngle(9,60);
        Assert.assertSame(270,angle);


    }

    @Test
    public void ShouldCalculateShortestPossibleDifferenceBetweenTwoAngle() {
        double angle= clockAngleUtil.calculateAngle(9,60);


        assertEquals(90.0,angle, DELTA);


    }
}
