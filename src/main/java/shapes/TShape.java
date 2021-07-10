package shapes;

import decorates.Color;

public class TShape extends Shape{

    public TShape(Color color, int xPos, int yPos) {
        super(color, new int[][]{{2, 1}, {1, 0}, {1, 1}, {1, 2}}, ShapeType.T_SHAPE);

    }
}
