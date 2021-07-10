package shapes;

import decorates.Color;

public class ZShape extends Shape{

    public ZShape(Color color, int xPos, int yPos) {
        super(color, xPos, yPos);
        this.shape = new int[][]{{1, 1, 0}, {0, 1, 1}, {0, 0, 0}};;
        this.coordinates = new int[][]{{2, 0}, {2, 1}, {1, 1}, {1, 2}};
    }
}
