public class HowFarAway extends ConsoleProgram
{
    public void run()
    {
        double startLat = readDouble("Enter the latitude of the starting location: ");
        double startLong = readDouble("Enter the longitutde of the starting location: ");
        double endLat = readDouble("Enter the latitude of the starting location: ");
        double endLong = readDouble("Enter the longitutde of the starting location: ");
        
        GeoLocation start = new GeoLocation(startLat, startLong);
        GeoLocation end = new GeoLocation(endLat, endLong);
        
        double distance = start.distanceFrom(end);
        
        System.out.println("The distance is " + distance + " miles.");
    }
}
