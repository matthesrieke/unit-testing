
package de.hsbochum.fbg.kswe.testing;

import java.util.List;

/**
 *
 * @author <a href="mailto:m.rieke@52north.org">Matthes Rieke</a>
 */
public class Polygon {
    
    private final List<Point> points;

    public Polygon(List<Point> points) {
        this.points = points;
    }

    public List<Point> getPoints() {
        return points;
    }
    
    public double calculateLength() {
        return 0.0;
    }

}
