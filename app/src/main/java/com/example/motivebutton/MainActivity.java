package com.example.motivebutton;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.RotateAnimation;
import android.view.animation.TranslateAnimation;
import android.widget.AbsoluteLayout;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    AbsoluteLayout abs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnMotive = findViewById(R.id.btnMotive);
        btnMotive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //set position TranslateAnimation(float fromXDelta, float toXDelta, float fromYDelta, float toYDelta
                final Animation animation = new TranslateAnimation(0, 100, 0, 0);
// set Animation for 5 sec
                animation.setDuration(1000);
//for button stops in the new position.
                animation.setFillAfter(true);
                btnMotive.startAnimation(animation);

            }
        });

        Button btnRotate = findViewById(R.id.btnRotate);
        btnRotate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int mCurrRotation = 360;
                float fromRotation = mCurrRotation;
                float toRotation = mCurrRotation -= 360;

                final RotateAnimation rotateAnim = new RotateAnimation(
                        fromRotation, toRotation, 300, 300);

                rotateAnim.setDuration(1000); // Use 0 ms to rotate instantly
                rotateAnim.setFillAfter(true); // Must be true or the animation will reset

                btnRotate.startAnimation(rotateAnim);
            }
        });
    }
}