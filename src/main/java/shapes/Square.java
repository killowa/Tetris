package shapes;

import decorates.Color;

public class Square extends Shape{

    public Square(Color color, int xPos, int yPos) {
        super(color, xPos, yPos);
        this.shape = new int[][]{{0, 1, 1}, {0, 1, 1}, {0, 0, 0}};;
        this.coordinates = new int[][]{{0, 1}, {0, 2}, {1, 1}, {1, 2}};
    }
}
