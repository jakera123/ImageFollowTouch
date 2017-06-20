package com.zxp.imagefollowtouch;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;

/**
 * Created by xiaoxin on 2017/6/20.
 */

public class sunView extends View {
    public float bitmapX;
    public float bitmapY;
    public float bitmapHeight;
    public float bitmapWidth;

    public sunView(Context context) {
        super(context);
        bitmapX=290;
        bitmapY=130;
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        Paint paint=new Paint();
        Bitmap bitmap= BitmapFactory.decodeResource(this.getResources(),R.drawable.sun);
        bitmapHeight=bitmap.getHeight();
        bitmapWidth=bitmap.getWidth();
        canvas.drawBitmap(bitmap,bitmapX,bitmapY,paint);
        if(bitmap.isRecycled()){
            bitmap.recycle();
        }
    }
}
