package Kap2Aufg7;

import java.awt.*;
import java.util.*;

import javax.swing.*;

public class Panel extends JPanel {

    private static final long serialVersionUID = 1L;

    Vector<Point> points;

    Panel() {
        this.points = new Vector<Point>();
    }

    public void markiere(final int x, final int y) {
        this.points.add(new Point(x, y));
        this.invalidate();
    }

    public void paint(final Graphics g) {
        final Iterator<Point> iter = this.points.iterator();
        while (iter.hasNext()) {
            final Point point = (Point)(iter.next());
            g.drawLine(point.x,point.y,point.x,point.y);
        }
    }
}
