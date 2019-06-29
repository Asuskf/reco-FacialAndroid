package com.example.recofacial;

import androidx.appcompat.app.AppCompatActivity;
import android.hardware.Camera.Face;
import android.graphics.Camera;
import android.os.Bundle;
import android.view.OrientationEventListener;
import android.view.SurfaceHolder;


public class recoFacial extends AppCompatActivity implements SurfaceHolder.Callback {

    private Camera camera;
    private int Orientation;
    private int OrientationCompensation;
    private OrientationEventListener orientationEventListener;
    private int DisplayRotation;
    private int DisplayOrientation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reco_facial);

    }


    @Override
    public void surfaceCreated(SurfaceHolder holder) {

    }

    @Override
    public void surfaceChanged(SurfaceHolder holder, int format, int width, int height) {

    }

    @Override
    public void surfaceDestroyed(SurfaceHolder holder) {

    }
}
