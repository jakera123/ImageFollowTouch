package com.zxp.imagefollowtouch;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FrameLayout frameLayout=(FrameLayout)findViewById(R.id.framlayout);
        final sunView sun=new sunView(MainActivity.this);
        sun.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                sun.bitmapY=event.getY()-sun.bitmapHeight/2;
                sun.bitmapX=event.getX()-sun.bitmapWidth/2;
                sun.invalidate();;
                return true;
            }
        });
        frameLayout.addView(sun);
    }
}
