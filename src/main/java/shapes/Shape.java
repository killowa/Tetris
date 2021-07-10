package shapes;

import decorates.Color;
import javafx.scene.Node;

import java.util.Arrays;

public abstract class Shape extends Node{

    private final Color color;
    private final int[][] shapeCoordinates;
    private final int[][] rightRotTran = new int[][]{{0, 1}, {-1, 0}};
    private final int[][] leftRotTran = new int[][]{{0, -1}, {1, 0}};
    private final int[][] tempCoordinates;

    public Shape(Color color, int[][] shapeCoordinates, ShapeType shapeType) {
        if (color == null || shapeCoordinates == null || shapeType == null)
            throw new IllegalArgumentException();

        this.color = color;
        this.shapeCoordinates = shapeCoordinates;
        tempCoordinates = new int[shapeCoordinates.length][shapeCoordinates[0].length];
    }

    public void moveLeft(float distance) {
        setLayoutX(getLayoutX() - distance);
    }

    public void moveRight(float distance) {
        setLayoutX(getLayoutX() + distance);
    }

    private void transformationMul(int[][] transMat) {

        int sum;
        for (int i = 0; i < shapeCoordinates.length; i++) {


            for (int k = 0; k < transMat[0].length; k++) {
                sum = 0;

                for (int j = 0; j < transMat.length; j++)
                    sum += shapeCoordinates[i][j] * transMat[j][k];

                tempCoordinates[i][k] = sum;
            }

        }
        //To copy from temp matrix to the shape matrix:
        for (int i = 0; i < shapeCoordinates.length; i++)
            System.arraycopy(tempCoordinates[i], 0, shapeCoordinates[i], 0, shapeCoordinates[i].length);

    }

    public void rotateRight() {
        transformationMul(rightRotTran);
        int maxNeg = 0;
        for (int[] shapeCoordinate : shapeCoordinates)
            maxNeg = Math.min(maxNeg, shapeCoordinate[0]);

        for (int i = 0; i < shapeCoordinates.length; i++)
            shapeCoordinates[i][0] += Math.abs(maxNeg);
    }

    public void rotateLeft() {
        transformationMul(leftRotTran);
        int maxNeg = 0;
        for (int[] shapeCoordinate : shapeCoordinates)
            maxNeg = Math.min(maxNeg, shapeCoordinate[1]);

        for (int i = 0; i < shapeCoordinates.length; i++)
            shapeCoordinates[i][1] += Math.abs(maxNeg);
    }

    public int[][] getShapeCoordinates() {
        return this.shapeCoordinates;
    }

    public Color getColor() {
        return color;
    }

}
