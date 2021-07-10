package shapes;

import decorates.Color;

public class Line extends Shape{

    public Line(Color color) {
        super(color, new int[][]{{0, 0}, {1, 0}, {2, 0}}, ShapeType.LINE_SHAPE);
    }
}
