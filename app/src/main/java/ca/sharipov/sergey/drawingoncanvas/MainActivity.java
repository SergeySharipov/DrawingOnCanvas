package ca.sharipov.sergey.drawingoncanvas;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Display;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int colorCircle = getResources().getColor(R.color.colorCircle);
        int colorLine = getResources().getColor(R.color.colorLine);

        setContentView(new DrawView(this, colorCircle, colorLine));
    }
}