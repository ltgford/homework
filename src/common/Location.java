package common;
import java.util.Objects;
/**
 * Represents a location on the map.
 */
public class Location {
    private final int x;
    private final int y;
    /**
     * Constructs a new Location object with the given x and y coordinates.
     * @param x The x coordinate
     * @param y The y coordinate
     */
    public Location(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() { return x;}
    public int getY() { return y;}

    /**
     * Returns whether the given location is equal to this location.
     * @param obj The object to compare to
     * @return True if the given location is equal to this location, and false otherwise
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Location location = (Location) obj;
        return x == location.x && y == location.y;
    }

    /**
     * Returns the hash code of this location.
     * @return The hash code of this location
     */
    @Override
    public int hashCode() {
        return Objects.hash(x,y);
    }

    /**
     * Returns a string representation of this location.
     * @return A string representation of this location
     */
    @Override
    public String toString() {
        return "Location{ " + "x=" + x + ", y=" + y + "}";
    }

    /**
     * Returns a string representation of this location.
     * @return A string representation of this location
     */
    public static Location parse(String s) {
        String[] parts = s.split(",");
        return new Location(Integer.parseInt(parts[0]), Integer.parseInt(parts[1]));
    }
}
