package com.example.davesmithtouchexample;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import com.example.davesmithtouchexample.widget.RotateZoomImageView;

import java.io.IOException;
import java.io.InputStream;

import androidx.appcompat.app.AppCompatActivity;

/**
 * Created by Dave Smith
 * Double Encore, Inc.
 * Date: 9/24/12
 * MultitouchActivity
 */
public class MultitouchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        RotateZoomImageView iv = new RotateZoomImageView(this);

        Bitmap image;
        try {
            InputStream in = getAssets().open("android.jpg");
            image = BitmapFactory.decodeStream(in);
            in.close();
        } catch (IOException e) {
            image = null;
        }
        iv.setImageBitmap(image);

        setContentView(iv);
    }
}
