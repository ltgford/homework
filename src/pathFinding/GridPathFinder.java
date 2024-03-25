package pathFinding;
import common.Location;
public interface GridPathFinder {
    /**
     * Returns the path from the start Location to the end location.
     * @param startLocation the start location
     * @param endLocation the end location
     * @return The path from the start location to the end location
     */
    Path findPath(Location startLocation, Location endLocation);

    /**
     * Returns the traversable neighbours of the given location
     * @param location the Location to get the neighbours of
     * @return The traversable neighboours of the given location
     */
    Iterable<Location> getNeighbours(Location location);

    Iterable<Location> getNeighbors(Location location);
}
