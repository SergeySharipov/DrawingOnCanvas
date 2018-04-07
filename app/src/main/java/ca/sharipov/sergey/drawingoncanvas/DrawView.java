package ca.sharipov.sergey.drawingoncanvas;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.os.Handler;
import android.view.SurfaceHolder;
import android.view.SurfaceView;

import static ca.sharipov.sergey.drawingoncanvas.Constants.MAX_POSITION;

public class DrawView extends SurfaceView implements SurfaceHolder.Callback {

    private static final int INTERVAL = 50;

    private int colorCircle = 0;
    private int colorLine = 0;
    private int number = 0;
    private int rotationN = 0;

    private Handler mHandler;
    private Runnable runnable = new Runnable() {
        @Override
        public void run() {
            try {
                updateView();
            } finally {
                mHandler.postDelayed(runnable, INTERVAL);
            }
        }
    };

    public DrawView(Context context) {
        super(context);

        getHolder().addCallback(this);

        mHandler = new Handler();

        if (colorCircle == 0 || colorLine == 0) {
            colorCircle = Color.YELLOW;
            colorLine = Color.CYAN;
        }
    }

    public DrawView(Context context, int colorCircle, int colorLine) {
        this(context);
        this.colorLine = colorLine;
        this.colorCircle = colorCircle;
    }

    @Override
    public void surfaceChanged(SurfaceHolder holder, int format, int width,
                               int height) {
    }

    @Override
    public void surfaceCreated(SurfaceHolder holder) {
        startRepeatingTask();
    }

    @Override
    public void surfaceDestroyed(SurfaceHolder holder) {
        stopRepeatingTask();
    }


    void startRepeatingTask() {
        runnable.run();
    }

    void stopRepeatingTask() {
        mHandler.removeCallbacks(runnable);
    }

    private void updateView() {
        Canvas canvas = null;
        try {
            canvas = getHolder().lockCanvas(null);
            if (canvas != null) {
                drawAll(canvas);
            }
        } finally {
            if (canvas != null) {
                getHolder().unlockCanvasAndPost(canvas);
            }
        }
    }

    private void drawAll(Canvas canvas) {
        canvas.drawColor(Color.BLACK);

        float height = getHeight();
        float position = height / 13;
        float r = (position - (height/100)) / 2;

        DrawHelper drawHelper = new DrawHelper(canvas, colorCircle, colorLine, 2);

        drawHelper.draw24Circles(position, position, position, r);
        drawHelper.draw48LinesIn24Circles(position, position, position, r,
                number - 1, number, rotationN);

        drawHelper.draw24Circles(position * 5, position, position, r);
        drawHelper.draw48LinesIn24Circles(position * 5, position, position, r,
                number, number + 1, rotationN);

        drawHelper.draw24Circles(position, position * 7, position, r);
        drawHelper.draw48LinesIn24Circles(position, position * 7, position, r,
                number + 1, number + 2, rotationN);

        drawHelper.draw24Circles(position * 5, position * 7, position, r);
        drawHelper.draw48LinesIn24Circles(position * 5, position * 7, position, r,
                number + 2, number + 3, rotationN);

        rotationN += 3;
        if (rotationN >= MAX_POSITION) {
            rotationN = 0;
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ignored) {
            }
            number++;
            if (number >= 9 - 3)
                number = 0;
        }
    }

//    int[] getTimeIntArray() {
//        @SuppressLint("SimpleDateFormat") SimpleDateFormat dateFormat =
//                new SimpleDateFormat("HHmm");
//        Date date = new Date();
//        char[] chars = dateFormat.format(date).toCharArray();
//        return new int[]{
//                Integer.parseInt(chars[0]+""),
//                Integer.parseInt(chars[1]+""),
//                Integer.parseInt(chars[2]+""),
//                Integer.parseInt(chars[3]+"")
//        };
//    }

}