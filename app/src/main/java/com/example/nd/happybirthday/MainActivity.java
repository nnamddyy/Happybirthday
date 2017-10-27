package com.example.nd.happybirthday;

import android.graphics.Color;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import nl.dionsegijn.konfetti.KonfettiView;
import nl.dionsegijn.konfetti.models.Shape;
import nl.dionsegijn.konfetti.models.Size;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final KonfettiView konfettiView = (KonfettiView)findViewById(R.id.konfetti_view);
        assert konfettiView != null;
        konfettiView.build()
                .addColors(Color.YELLOW,Color.GREEN,Color.MAGENTA,Color.CYAN,Color.RED)
                .setDirection(0.0,359.0)
                .setSpeed(3f,9f)
                .setFadeOutEnabled(true)
                .setTimeToLive(90000L)
                .addShapes(Shape.RECT,Shape.CIRCLE)
                .addSizes(new Size(12,5f))
                .setPosition(-50f,konfettiView.getWidth()+50f,-50f,-50f)
                .stream(300,5000L);

    }
}
