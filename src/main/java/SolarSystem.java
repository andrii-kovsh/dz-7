public enum SolarSystem {
    MERCURY(0, 2439, null),
    VENUS(108, 6051, MERCURY),
    EARTH(150, 6371, VENUS),
    MARS(228, 3389, EARTH),
    JUPITER(778, 69911, MARS),
    SATURN(1427, 58232, JUPITER),
    URANUS(2871, 25362, SATURN),
    NEPTUNE(4497, 24622, URANUS),
    PLUTO(5906, 1188, NEPTUNE);

    private final int distanceFromPrevious;
    private final int distanceFromSun;
    private final int radius;
    private final SolarSystem previousPlanet;

    SolarSystem(int prevDistance, int radius, SolarSystem previous) {
        if (previous != null) {
            this.distanceFromPrevious = prevDistance;
            this.distanceFromSun = previous.getDistanceFromSun() + prevDistance;
            this.previousPlanet = previous;
            this.orderFromSun = previous.getOrderFromSun() + 1;
        } else {
            this.distanceFromPrevious = 0;
            this.distanceFromSun = 46;
            this.previousPlanet = null;
            this.orderFromSun = 1;
        }
        this.radius = radius;
    }

    private final int orderFromSun;

    public int getOrderFromSun() {
        return orderFromSun;
    }

    public int getDistanceFromPrevious() {
        return distanceFromPrevious;
    }

    public int getDistanceFromSun() {
        return distanceFromSun;
    }

    public int getRadius() {
        return radius;
    }

    public SolarSystem getPreviousPlanet() {
        return previousPlanet;
    }

    public SolarSystem getNextPlanet() {
        SolarSystem[] planets = SolarSystem.values();
        if (this.ordinal() < planets.length - 1) {
            return planets[this.ordinal() + 1];
        }
        return null;
    }
}