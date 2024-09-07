// GeoLocation.java
public class GeoLocation 
{
    public static final double RADIUS = 3963.1676;  
    
    public static final double KM_PER_MILE = 1.60934;

    private double latitude;
    private double longitude;

    public GeoLocation(double theLatitude, double theLongitude) 
    {
        latitude = theLatitude;
        longitude = theLongitude;
    }

    public double getLatitude() 
    {
        return latitude;
    }

    public double getLongitude() 
    {
        return longitude;
    }

    public String toString() 
    {
        return "latitude: " + latitude + ", longitude: " + longitude;
    }

    public double distanceFromInKilometers(GeoLocation other)
    {
        // fill this in.
        return distanceFrom(other) * KM_PER_MILE;
    }

    public double distanceFrom(GeoLocation other) 
    {
        double lat1 = Math.toRadians(latitude);
        double long1 = Math.toRadians(longitude);
        double lat2 = Math.toRadians(other.latitude);
        double long2 = Math.toRadians(other.longitude);
        double theCos = Math.sin(lat1) * Math.sin(lat2) +
            Math.cos(lat1) * Math.cos(lat2) * Math.cos(long1 - long2);
        double arcLength = Math.acos(theCos);
        return arcLength * RADIUS;
    }
}

// DistanceTester.java
public class DistanceTester extends ConsoleProgram
{
    public static double SAN_FRANCISCO_LONGITUDE = 122.4167;
    public static double SAN_FRANCISCO_LATITUDE = 37.7833;
    public static double NEW_YORK_LONGITUDE = 74.0059;
    public static double NEW_YORK_LATITUDE = 40.7127;
    
    public void run()
    {
        GeoLocation sf = new GeoLocation(SAN_FRANCISCO_LATITUDE, SAN_FRANCISCO_LONGITUDE);
        GeoLocation nyc = new GeoLocation(NEW_YORK_LATITUDE, NEW_YORK_LONGITUDE);
        double distance = sf.distanceFromInKilometers(nyc);
        System.out.println("The distance from San Francisco to New York is " + distance + " kilometers");
    }
}
