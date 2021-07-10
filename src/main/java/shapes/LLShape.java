package shapes;

import decorates.Color;

public class LLShape extends Shape{

    public LLShape(Color color, int xPos, int yPos) {
        super(color, new int[][]{{2, 0}, {1, 0}, {1, 1}, {1, 2}}, ShapeType.LL_SHAPE);
    }
}
