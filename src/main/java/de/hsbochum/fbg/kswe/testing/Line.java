package de.hsbochum.fbg.kswe.testing;

import java.util.Optional;

/**
 *
 * @author <a href="mailto:m.rieke@52north.org">Matthes Rieke</a>
 */
public class Line {

    private final Point start, end;

    public Line(Point start, Point end) {
        this.start = start;
        this.end = end;
    }

    public Optional<Point> intersection(Line other) {
        Point startA = this.start;
        Point endA = this.end;
        Point startB = other.start;
        Point endB = other.end;

        // Line AB represented as a1x + b1y = c1
        double a1 = endA.y - startA.y;
        double b1 = startA.x - endA.x;
        double c1 = a1 * (startA.x) + b1 * (startA.y);

        // Line CD represented as a2x + b2y = c2
        double a2 = endB.y - startB.y;
        double b2 = startB.x - endB.x;
        double c2 = a2 * (startB.x) + b2 * (startB.y);

        double determinant = a1 * b2 - a2 * b1;

        if (determinant == 0) {
            // The lines are parallel. No intersection
            return Optional.empty();
        } else {
            double x = (b2 * c1 - b1 * c2) / determinant;
            double y = (a1 * c2 - a2 * c1) / determinant;
            return Optional.of(new Point(x, y));
        }
    }

}
