package test.clock;


public class ClockAngleUtil {

    public double calculateDifferenceBetweenTwoAngle(int hours, int minutes) {
        if (minutes==60) minutes=0;
        if (hours==12) hours=0;
        return Math.abs(calculateHourAngle(hours, minutes) - calculateMinuteAngle(minutes));
    }

    public double calculateAngle(int hours, int minutes) {
        final double calculateDifferenceBetweenTwoAngle = calculateDifferenceBetweenTwoAngle(hours, minutes);
        return Math.min(360- calculateDifferenceBetweenTwoAngle,calculateDifferenceBetweenTwoAngle);

    }

    private double calculateHourAngle(int hours, int minutes) {
        return 0.5 * (60 * hours) + minutes;
    }

    private double calculateMinuteAngle(int minutes) {

        return 0.6 * minutes;
    }

}
