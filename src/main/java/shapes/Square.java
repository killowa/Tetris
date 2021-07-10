package shapes;

import decorates.Color;

public class Square extends Shape{

    public Square(Color color, int xPos, int yPos) {
        super(color, new int[][]{{2, 2}, {2, 1}, {1, 2}, {1, 1}}, ShapeType.SQUARE_SHAPE);
    }
}
