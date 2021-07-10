package Data;

import Data.Difficulties.Difficulty;
import javafx.scene.input.KeyEvent;

public class Settings {

    private KeyEvent moveRight;
    private KeyEvent moveLeft;
    private KeyEvent rightRotate;
    private KeyEvent leftRotate;
    private KeyEvent moveDown;
    private Difficulty difficulty;

    public Settings(KeyEvent moveRight, KeyEvent moveLeft, KeyEvent rightRotate, KeyEvent leftRotate, KeyEvent moveDown, Difficulty difficulty) {
        if (moveRight == null || moveLeft == null || rightRotate == null || leftRotate == null || moveDown == null || difficulty == null)
            throw new IllegalArgumentException();

        this.moveRight = moveRight;
        this.moveLeft = moveLeft;
        this.rightRotate = rightRotate;
        this.leftRotate = leftRotate;
        this.moveDown = moveDown;
        this.difficulty = difficulty;
    }

    public KeyEvent getMoveRight() {
        return moveRight;
    }

    public void setMoveRight(KeyEvent moveRight) {
        if (moveRight == null)
            throw new IllegalArgumentException();

        this.moveRight = moveRight;
    }

    public KeyEvent getMoveLeft() {
        return moveLeft;
    }

    public void setMoveLeft(KeyEvent moveLeft) {
        if (moveLeft == null)
            throw new IllegalArgumentException();

        this.moveLeft = moveLeft;
    }

    public KeyEvent getRightRotate() {
        return rightRotate;
    }

    public void setRightRotate(KeyEvent rightRotate) {
        if (rightRotate == null)
            throw new IllegalArgumentException();

        this.rightRotate = rightRotate;
    }

    public KeyEvent getLeftRotate() {
        return leftRotate;
    }

    public void setLeftRotate(KeyEvent leftRotate) {
        if (leftRotate == null)
            throw new IllegalArgumentException();

        this.leftRotate = leftRotate;
    }

    public KeyEvent getMoveDown() {
        return moveDown;
    }

    public void setMoveDown(KeyEvent moveDown) {
        if (moveLeft == null)
            throw new IllegalArgumentException();

        this.moveDown = moveDown;
    }

    public Difficulty getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(Difficulty difficulty) {
        if (difficulty == null)
            throw new IllegalArgumentException();

        this.difficulty = difficulty;
    }
}
