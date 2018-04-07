package ca.sharipov.sergey.drawingoncanvas;

public class LineInsideCircle {
    private float cX;
    private float cY;
    private float radius;
    private int numberPosition;
    private int previousNumberPosition;
    private int rotationN;

    private LineInsideCircle() {
    }

    LineInsideCircle(float cX, float cY, float radius, int numberPosition, int previousNumberPosition, int rotationN) {
        this();
        this.cX = cX;
        this.cY = cY;
        this.radius = radius;
        this.numberPosition = numberPosition;
        this.previousNumberPosition = previousNumberPosition;
        this.rotationN = rotationN;
    }

    public float getCx() {
        return cX;
    }

    public float getCy() {
        return cY;
    }

    public float getRadius() {
        return radius;
    }

    private int getDifferencePosition() {
        return previousNumberPosition - numberPosition;
    }

    public int getNextPosition() {
        if (getDifferencePosition() > 1
                && previousNumberPosition - rotationN > numberPosition) {
            return previousNumberPosition - rotationN;
        } else if (getDifferencePosition() < 1
                && previousNumberPosition + rotationN < numberPosition) {
            return previousNumberPosition + rotationN;
        } else
            return numberPosition;
    }
}
