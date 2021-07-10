package shapes;

import decorates.Color;

public class ZShape extends Shape{

    public ZShape(Color color, int xPos, int yPos) {
        super(color, new int[][]{{2, 0}, {2, 1}, {1, 1}, {1, 2}}, ShapeType.Z_SHAPE);

    }
}
