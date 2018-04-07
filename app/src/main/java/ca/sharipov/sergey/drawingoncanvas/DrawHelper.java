package ca.sharipov.sergey.drawingoncanvas;

import android.graphics.Canvas;
import android.graphics.Paint;

import static ca.sharipov.sergey.drawingoncanvas.Constants.NUMBERS_POSITIONS;

public class DrawHelper {
    private final int colorCircle;
    private final int colorLine;
    private final float strokeWidth;
    private Canvas canvas;

    DrawHelper(Canvas canvas, int colorCircle, int colorLine, float strokeWidth) {
        this.canvas = canvas;
        this.colorCircle = colorCircle;
        this.colorLine = colorLine;
        this.strokeWidth = strokeWidth;
    }

    public void draw24Circles(float startX, float startY, float distance, float r) {
        final float startXConst = startX;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 4; j++) {
                drawCircle(startX, startY, r);
                startX += distance;
            }
            startX = startXConst;
            startY += distance;
        }
    }

    public void draw48LinesIn24Circles(float startX, float startY, float distance, float r, int previousNumber, int number, int rotationN) {
        if (previousNumber < 0 || previousNumber > 9)
            previousNumber = 10;

        final float startXConst = startX;
        int n = 0;
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 4; j++) {
                drawLinesInCircle(startX, startY, r, previousNumber, number, n++, rotationN);
                startX += distance;
            }
            startX = startXConst;
            startY += distance;
        }
    }

    private void drawCircle(float cX, float cY, float radius) {
        Paint paint = new Paint();
        paint.setStrokeWidth(strokeWidth);
        paint.setColor(colorCircle);

        paint.setStyle(Paint.Style.STROKE);
        canvas.drawCircle(cX, cY, radius, paint);
    }

    private void drawLine(float cX, float cY, float radius, int rotationN) {
        Paint paint = new Paint();
        paint.setStrokeWidth(strokeWidth);
        paint.setColor(colorLine);

        canvas.save();
        canvas.rotate(rotationN, cX, cY);
        canvas.drawLine(cX, cY, cX, cY + radius, paint);
        canvas.restore();
    }

    private void drawLinesInCircle(float cX, float cY, float radius, int previousNumber,
                                   int number, int n, int rotationN) {
        int previousNumberPosition0 = NUMBERS_POSITIONS[previousNumber][n][0];
        int previousNumberPosition1 = NUMBERS_POSITIONS[previousNumber][n][1];

        if (NUMBERS_POSITIONS[number][n][0] == previousNumberPosition1
                || NUMBERS_POSITIONS[number][n][1] == previousNumberPosition0) {
            int temp = previousNumberPosition0;
            previousNumberPosition0 = previousNumberPosition1;
            previousNumberPosition1 = temp;
        }

        LineInsideCircle lineInsideCircle1 = new LineInsideCircle(cX, cY, radius,
                NUMBERS_POSITIONS[number][n][0], previousNumberPosition0, rotationN);
        LineInsideCircle lineInsideCircle2 = new LineInsideCircle(cX, cY, radius,
                NUMBERS_POSITIONS[number][n][1], previousNumberPosition1, rotationN);

        drawLineInCircle(lineInsideCircle1);
        drawLineInCircle(lineInsideCircle2);
    }

    private void drawLineInCircle(LineInsideCircle line) {
        drawLine(line.getCx(), line.getCy(), line.getRadius(), line.getNextPosition());
    }
}