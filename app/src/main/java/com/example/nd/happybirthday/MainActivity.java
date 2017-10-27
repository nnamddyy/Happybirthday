package com.example.nd.happybirthday;

import android.graphics.drawable.AnimationDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class MainActivity extends AppCompatActivity {

    private RelativeLayout view;

    private AnimationDrawable anim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        view = (RelativeLayout) findViewById(R.id.view);

        anim = (AnimationDrawable) view.getBackground();

        startAnim();

    }

    public void startAnim() {

        anim.setEnterFadeDuration(5000);

        anim.setExitFadeDuration(5000);

        anim.start();

    }

}
