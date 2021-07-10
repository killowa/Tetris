package shapes;

import decorates.Color;

public class SShape extends Shape{

    public SShape(Color color, int xPos, int yPos) {
        super(color, new int[][]{{2, 2}, {2, 1}, {1, 1}, {1, 0}}, ShapeType.S_SHAPE);

    }
}
