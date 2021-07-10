package shapes;

import decorates.Color;

public class LRShape extends Shape{

    public LRShape(Color color, int xPos, int yPos) {
        super(color, new int[][]{{2, 2}, {1, 0}, {1, 1}, {1, 2}}, ShapeType.LR_SHAPE);
    }
}
