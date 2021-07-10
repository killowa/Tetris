package shapes;

import decorates.Color;

import java.util.Random;

public class Shape {

    protected Color color;
    protected int[][] shape;
    protected int[][] coordinates;
    protected int xPos;
    protected int yPos;
    protected Random random;

    public Shape(Color color, int xPos, int yPos) {
        this.coordinates = coordinates;
        this.shape = shape;
        this.color = color;
        this.xPos = xPos;
        this.yPos = yPos;
    }

    public void moveLeft() {
        this.xPos-=1;
    }

    public void moveRight() {
        this.xPos+=1;
    }

    public void rotateRight() {

        int [][] trans = new int[][]{{0, 1}, {-1, 0}};
        int [][] ans = new int[coordinates.length][coordinates[0].length];
        int maxNeg = 0;

        for (int i = 0; i < coordinates.length; i++){

            for (int k = 0; k < trans[0].length; k++) {
                int sum = 0;
                for (int j = 0; j < trans.length; j++) {
                    sum += coordinates[i][j] * trans[j][k];
                    maxNeg = Math.min(sum, maxNeg);
                }
                ans[i][k] = sum;
            }
        }

        for (int i = 0; i < ans.length; i++)
            ans[i][0] += Math.abs(maxNeg);

        coordinates = ans;
    }

    public void rotateLeft() {

        int [][] trans = new int[][]{{0, -1}, {1, 0}};

        int [][] ans = new int[coordinates.length][coordinates[0].length];
        int maxNeg = 0;

        for (int i = 0; i < coordinates.length; i++){

            for (int k = 0; k < trans[0].length; k++) {
                int sum = 0;
                for (int j = 0; j < trans.length; j++) {
                    sum += coordinates[i][j] * trans[j][k];
                    maxNeg = Math.min(sum, maxNeg);
                }
                ans[i][k] = sum;
            }
        }

        for (int i = 0; i < ans.length; i++)
            ans[i][0] += Math.abs(maxNeg);

        coordinates = ans;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int[][] getShape() {
        return shape;
    }

    public void setShape(int[][] shape) {
        this.shape = shape;
    }
}
